package com.statemachine.action;

import com.statemachine.Events;
import com.statemachine.States;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;

import java.util.Map;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author likaiqiang
 * @description  do action during SI change to S1
 * @create 2016-11-13 下午5:51
 **/
public class SItoS1Action implements Action<States, Events> {

    private static final Logger LOG = getLogger(SItoS1Action.class);

    @Override
    public void execute(StateContext<States, Events> context) {
//        Map<Object, Object> variables = context.getExtendedState().getVariables();
        String orderNo = context.getExtendedState().get("orderNo", String.class);
        LOG.info("receive variable orderNo is {}", orderNo);
    }
}
