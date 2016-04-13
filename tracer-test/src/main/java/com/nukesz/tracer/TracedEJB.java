package com.nukesz.tracer;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import com.nukesz.tracer.boundary.TracerInterceptor;

@Stateless
@Interceptors(TracerInterceptor.class)
public class TracedEJB {

    public void methodWithoutArguments() {
    }

    public void methodWithTwoArguments(final String arg1, final int arg2) {
    }

    public int methodReturnsInt() {
        return 42;
    }
}
