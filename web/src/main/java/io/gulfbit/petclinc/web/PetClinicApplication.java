package io.gulfbit.petclinc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"io"}, exclude = JpaRepositoriesAutoConfiguration.class)
//@ComponentScan(basePackages = {"io.gulfbit.petclinc.web", "io.gulfbit.petclinc.data"})
//@EntityScan("io.gulfbit.petclinc.data.model")
@EnableJpaRepositories("io.gulfbit.petclinc.data.repositories")
public class PetClinicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetClinicApplication.class, args);
    }

}
