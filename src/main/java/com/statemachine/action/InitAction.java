package com.statemachine.action;

import com.statemachine.Events;
import com.statemachine.States;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * @author likaiqiang
 * @description init state env
 * @create 2016-11-13 下午6:01
 **/
public class InitAction implements Action<States, Events> {

    private static final Logger LOG = LoggerFactory.getLogger(InitAction.class);

    private static final String INIT_ORDERNO = "ljdljlfjljljjlj";

    @Override
    public void execute(StateContext<States, Events> stateContext) {
        Map<Object, Object> variables = stateContext.getExtendedState().getVariables();
        String orderNo = stateContext.getExtendedState().get("orderNo", String.class);
        if(orderNo == null || "".equals(orderNo.trim())) {
            variables.put("orderNo", INIT_ORDERNO);
            LOG.info("init variable orderNo is null , set value = {}", INIT_ORDERNO );
        } else {
            LOG.info("variable orderNo is not null , get value = {}", orderNo);
        }

    }
}
