package com.gedois.demobpmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Component
public class MessageSendList implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        Map<String,Object> messageToSend = new HashMap<>();
        ArrayList<String> list = (ArrayList<String>) execution.getVariable("list");
        messageToSend.put("list", list);
        execution.getProcessEngine().getRuntimeService().correlateMessage("MsgList", execution.getProcessBusinessKey(), messageToSend);

    }
}
