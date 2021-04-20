package com.test1;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import jdk.nashorn.internal.objects.annotations.Setter;


@PropertySource(value = "classpath:application.properties")
//该标签才会让 configuration 注解生效，负责始终取不到配置文件内容
@EnableConfigurationProperties 
@ConfigurationProperties(prefix = "strategy")
@Component
public class StrategyAliasConfig {
    private HashMap<String, String> aliasMap;
    
 
    private String  name;

    public static final String DEFAULT_STATEGY_NAME = "concreateStrategyC";
    
//    public StrategyAliasConfig()
//    {
//    	aliasMap = new HashMap<String, String>();
//    	aliasMap.put("strategyB","concreateStrategyB");
//    	aliasMap.put("strategyA","concreateStrategyA");
//    }

    public HashMap<String, String> getAliasMap() {
        return aliasMap;
    }
    
    
    
    
    
    
    public String getName() {
		return name;
	}
    
    
    
	public void setName(String name) {
		this.name = name;
	}

	@Setter
    public void setAliasMap(HashMap<String, String> aliasMap) {
        this.aliasMap = aliasMap;
    }

    public String of(String entNum) {
        return aliasMap.get(entNum);
    }
}
