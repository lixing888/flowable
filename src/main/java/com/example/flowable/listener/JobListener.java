package com.example.flowable.listener;

import org.flowable.engine.common.api.delegate.event.FlowableEngineEventType;
import org.flowable.engine.common.api.delegate.event.FlowableEvent;
import org.flowable.engine.common.api.delegate.event.FlowableEventListener;

/**
 * @Author: ZhangRui
 * @Description:
 * @date: Created in 9:35 2018/4/25
 * @Modified By:
 */
public class JobListener implements FlowableEventListener {
    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        switch ((FlowableEngineEventType)flowableEvent.getType()) {

            case JOB_EXECUTION_SUCCESS:
                System.out.println("A job well done!");
                break;

            case JOB_EXECUTION_FAILURE:
                System.out.println("A job has failed...");
                break;
        }    }

    @Override
    public boolean isFailOnException() {
        return false;
    }
}
