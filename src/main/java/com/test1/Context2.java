package com.test1;
public class Context2 {
    //�����ɫ
    private Strategy strategy = null;

    //��ʵ����������ԵĹ��̴Ӹ߲�ģ��ת�Ƶ�Context���С��򵥹�����Ӧ��
    public Context2(String strategyType) {
//        switch (strategyType) {
//            case "strategyA":
//                this.strategy = new ConcreateStrategyA();
//                break;
//            case "strategyB":
//                this.strategy = new ConcreateStrategyB();
//                break;
//            case "strategyC":
//                this.strategy = new ConcreateStrategyC();
//                break;
//        }
    }

    //���ò��Է���
    public void printTheS10Result() {
        strategy.TES_VS_DWG();
    }
}
