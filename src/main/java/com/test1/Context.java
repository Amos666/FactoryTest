package com.test1;
//��װ��ɫ
public class Context {
    //�������
    private Strategy strategy;

    //���캯�����þ������
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //��װ��Ĳ��Է���
    public void doAnything() {
        this.strategy.TES_VS_DWG();
    }
}
