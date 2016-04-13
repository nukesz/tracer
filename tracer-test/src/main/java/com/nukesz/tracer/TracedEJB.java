package com.nukesz.tracer;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;

import com.nukesz.tracer.boundary.TracerInterceptor;

@Stateless
@Interceptors(TracerInterceptor.class)
public class TracedEJB {

	public void methodWithoutArguments() {
	}

	public void methodWithTwoArguments(String arg1, int arg2) {
	}
	
	public int methodReturnsInt() {
		return 42;
	}
}
