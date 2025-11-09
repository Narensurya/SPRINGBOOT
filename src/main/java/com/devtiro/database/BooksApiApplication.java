package com.devtiro.database;

import lombok.extern.java.Log;

import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class BooksApiApplication {

    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Kolkata"));
        System.setProperty("user.timezone", "Asia/Kolkata");
        
        // PROOF IT WORKED
        System.out.println("JVM TIMEZONE LOCKED TO: " + TimeZone.getDefault().getID());
        SpringApplication.run(BooksApiApplication.class, args);
    }
}
