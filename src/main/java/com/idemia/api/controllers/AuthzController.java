package com.idemia.api.controllers;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.json.JsonObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.idemia.api.config.ApplicationConfig;
import com.idemia.api.dao.AuthzRepository;
import com.idemia.api.model.Authz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authz")
public class AuthzController {

    @Autowired
    private AuthzRepository repository;

    @Autowired
    private ApplicationConfig config;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Authz create(@RequestBody Authz authz) throws JsonProcessingException {
        Cluster cluster = Cluster.connect(config.getHost(), config.getUsername(), config.getPassword());
        Collection collection = cluster.bucket("gluu_user").defaultCollection();
        collection.upsert(
                "authorizations_".concat(authz.getOxId()),
                JsonObject.fromJson(new ObjectMapper().writeValueAsString(authz))
        );
        cluster.disconnect();
        return authz;
    }
}
