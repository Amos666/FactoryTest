package com.test1;
//封装角色
public class Context {
    //抽象策略
    private Strategy strategy;

    //构造函数设置具体策略
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //封装后的策略方法
    public void doAnything() {
        this.strategy.TES_VS_DWG();
    }
}
