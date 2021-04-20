package com.test1;
public class Context2 {
    //抽象角色
    private Strategy strategy = null;

    //将实例化具体策略的过程从高层模块转移到Context类中。简单工厂的应用
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

    //调用策略方法
    public void printTheS10Result() {
        strategy.TES_VS_DWG();
    }
}
