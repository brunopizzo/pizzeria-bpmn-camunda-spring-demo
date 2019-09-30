package com.gedois.demobpmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class DelegateUpdateList implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        int price;
        ArrayList<String> list = (ArrayList<String>) execution.getVariable("list");
        if(list == null){
            list = new ArrayList<>();
            price = 0;
        }else {
            price = (Integer) execution.getVariable("price");
        }
        price = price + 10;
        list.add((String) execution.getVariable("pizza"));
        execution.setVariable("list",list);
        execution.setVariable("price",price);
    }
}
