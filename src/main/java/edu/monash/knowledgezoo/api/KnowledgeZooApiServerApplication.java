package edu.monash.knowledgezoo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("edu.monash.knowledgezoo.api.repository")
public class KnowledgeZooApiServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KnowledgeZooApiServerApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(KnowledgeZooApiServerApplication.class, args);
    }
}
