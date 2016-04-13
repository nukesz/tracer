package com.nukesz.tracer.boundary;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.nukesz.tracer.entity.TraceEvent;

public class TracerInterceptor {

    @Inject
    Event<TraceEvent> monitoring;

    @AroundInvoke
    public Object logCall(final InvocationContext ic) throws Exception {
        Object result = null;
        try {
            result = ic.proceed();
            return result;
        } finally {
            final Object[] parameters = ic.getParameters();
            final String className = ic.getTarget().getClass().getName();
            final String methodName = ic.getMethod().getName();
            monitoring.fire(new TraceEvent(className, methodName, parameters, result));
        }

    }

}
