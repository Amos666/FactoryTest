package com.test1;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class StrategyFactory {
    @Autowired
    public StrategyAliasConfig strategyAliasConfig;

    //Spring���Զ���Strategy�ӿڵ�ʵ����ע�뵽���Map�У�keyΪbean id��valueֵ��Ϊ��Ӧ�Ĳ���ʵ����
    @Autowired
    private Map<String, Strategy> strategyMap;

    //�Ҳ�����Ӧ�Ĳ����࣬ʹ��Ĭ�ϵ�
    public Strategy getBy(String strategyName) {
        String name = strategyAliasConfig.of(strategyName);
        if (name == null) {
            return strategyMap.get(StrategyAliasConfig.DEFAULT_STATEGY_NAME);
        }
        Strategy strategy = strategyMap.get(name);
        if (strategy == null) {
            return strategyMap.get(StrategyAliasConfig.DEFAULT_STATEGY_NAME);
        }
        return strategy;

    }
}
