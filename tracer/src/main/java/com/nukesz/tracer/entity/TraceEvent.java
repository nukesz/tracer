package com.nukesz.tracer.entity;

import java.util.Arrays;

public class TraceEvent {

	private final String className;
	private final String methodName;
	private final Object[] parameters;
	private final Object result;

	public TraceEvent(final String className, final String methodName, final Object[] parameters,
			final Object returned) {
		this.className = className;
		this.methodName = methodName;
		this.parameters = parameters;
		this.result = returned;
	}

	@Override
	public String toString() {
		return "TraceEvent [className=" + className + ", methodName=" + methodName
				+ (parameters != null ? ", parameters=" + Arrays.toString(parameters) : "")
				+ (result != null ? ", result=" + result + "]" : "");
	}

}
