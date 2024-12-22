package com.systemadmin.cloudfun.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminApplication {
 private static final Logger L = LoggerFactory.getLogger(Appendable.class);
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        appStart();
    }
    private static void appStart() {
        L.info("--------------------------------------------------------------------");
        L.info("           Welcome to my application by Thong Ngo                   ");
        L.info("           Application Start                                        ");
        L.info("--------------------------------------------------------------------");
    }
}
