package com.test1;
import org.springframework.stereotype.Component;

@Component
public class ConcreateStrategyB implements Strategy{
    @Override
    public void TES_VS_DWG(){
        System.out.println("TES:DWG - 3:1");
    }
    
    
    @Override
    public String toString() {
        return "¾ßÌå²ßÂÔ2";
    }
}
