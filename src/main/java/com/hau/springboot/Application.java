package com.hau.springboot;

import com.hau.springboot.configuration.JpaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Hau on 20/04/2017.
 */
@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = "com.hau.springboot")
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
