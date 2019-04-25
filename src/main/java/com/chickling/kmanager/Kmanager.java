package com.chickling.kmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Hulva Luva.H
 *
 */
@Slf4j
@SpringBootApplication
@ComponentScan("com.chickling.kmanager.**")
public class Kmanager {
  public static void main(String[] args) throws Exception {
    ApplicationContext context = SpringApplication.run(Kmanager.class, args);
    String serverPort = context.getEnvironment().getProperty("server.port");
    log.info("KManager started at http://localhost:" + serverPort);
  }
}
