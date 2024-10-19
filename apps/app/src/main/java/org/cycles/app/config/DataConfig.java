package org.cycles.app.config;


import org.cycles.models.entities.User;
import org.cycles.models.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.util.UUID;

@Configuration
@ComponentScan("org.cycles.models.services")
@EnableJpaRepositories(basePackages = "org.cycles.models.repositories")
@EntityScan("org.cycles.models.entities")
@EnableTransactionManagement
@PropertySource("classpath:development.properties")
@Profile("development")
public class DataConfig {

    @Bean
    public CommandLineRunner createDummyUser(UserService userService) {
        return args -> {
            var users = userService.getAllUsers();
            System.out.println("Users: " + users);
//            if (users.isEmpty()) {
                var user = userService.createUser(new User(UUID.randomUUID(), "Emmanuel", "Enwenede"));
                System.out.println("Created user: " + user);
//            }
        };
    }
}

