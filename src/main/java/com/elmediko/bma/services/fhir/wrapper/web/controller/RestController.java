package com.elmediko.bma.services.fhir.wrapper.web.controller;

import io.quarkus.vertx.web.Route;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.RoutingContext;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
public class RestController {

    public static final String TEST = "/test";

    @Route(
            path = TEST,
            methods = HttpMethod.GET,
            produces = MediaType.TEXT_PLAIN
    )
    public void hello(RoutingContext rc) {
        rc.response().end("hello");
    }
}