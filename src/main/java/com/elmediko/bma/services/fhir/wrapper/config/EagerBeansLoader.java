package com.elmediko.bma.services.fhir.wrapper.config;

import io.quarkus.runtime.StartupEvent;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.ws.rs.ext.RuntimeDelegate;

/**
 * Class is used to eagerly load all required beans and will try to preserve the bean load logic
 * All beans that require such load should be added here as dependencies
 */
@ApplicationScoped
@Getter
@Setter
@Slf4j
public class EagerBeansLoader {

    public void init(@Observes StartupEvent event) throws Exception {
        log.info("init start");
        System.setProperty(RuntimeDelegate.JAXRS_RUNTIME_DELEGATE_PROPERTY, "org.jboss.resteasy.core.providerfactory.ResteasyProviderFactoryImpl");
        log.info("init end");
    }
}
