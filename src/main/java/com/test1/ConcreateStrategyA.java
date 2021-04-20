package com.test1;
import org.springframework.stereotype.Component;

@Component
public class ConcreateStrategyA implements Strategy{
    @Override
    public void TES_VS_DWG(){
        System.out.println("TES:DWG - 3:0");
    }
    
    @Override
    public String toString() {
        return "¾ßÌå²ßÂÔ1";
    }
}
