package org.arka_anil.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"org.arka_anil"})
@EnableJpaRepositories(basePackages = {"org.arka_anil"})
@EntityScan(basePackages = {"org.arka_anil"})
public class SpringBootRestApiApp {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootRestApiApp.class, args);
  }
}
