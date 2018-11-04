package org.arka_anil.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"org.arka_anil"})
public class SpringBootRestApiApp {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRestApiApp.class, args);
  }
}
