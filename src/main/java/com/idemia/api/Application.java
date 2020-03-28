package com.idemia.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseAutoConfiguration;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication(exclude = {
        CouchbaseAutoConfiguration.class
})
public class Application {
    public static void main(String[] args) {
        run(Application.class, args);
    }
}
