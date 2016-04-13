package com.nukesz.tracer.control;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

import com.nukesz.tracer.entity.TraceEvent;

@Stateless
public class TraceMonitor {

    private static Logger LOGGER = Logger.getLogger(TraceMonitor.class.getName());

    public void onTraceEvent(@Observes final TraceEvent event) {
        LOGGER.log(Level.FINER, event.toString());
    }
}
