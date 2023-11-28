package br.edu.infnet.pb_back.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "br.edu.infnet.pb_back.model")
public class PbBackApplication {
    public static void main(String[] args) {
        SpringApplication.run(PbBackApplication.class, args);
    }
}
