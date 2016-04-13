package com.nukesz.tracer;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("trace")
@Stateless
public class TracerDemo {

    @Inject
    TracedEJB tracedEJB;

    @GET
    public int get() {
        tracedEJB.methodWithoutArguments();
        tracedEJB.methodWithTwoArguments("HelloInterceptor", 2);
        return tracedEJB.methodReturnsInt();
    }
}
