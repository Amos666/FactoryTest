package com.test1;
import org.springframework.stereotype.Component;

@Component
public class ConcreateStrategyC implements Strategy{
    @Override
    public void TES_VS_DWG(){
        System.out.println("TES:DWG - 3:2");
    }
    
    
    @Override
    public String toString() {
        return "¾ßÌå²ßÂÔ3";
    }
}
