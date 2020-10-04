package dev.kazusato.k8sbook.simplebatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleBatchOnK8sApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleBatchOnK8sApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SimpleBatchOnK8sApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("==== BATCH START ====");

        LOGGER.info("==== BATCH END ====");
    }
}
