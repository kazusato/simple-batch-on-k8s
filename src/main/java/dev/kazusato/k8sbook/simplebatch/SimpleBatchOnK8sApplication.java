package dev.kazusato.k8sbook.simplebatch;

import dev.kazusato.k8sbook.simplebatch.entity.LocationEntity;
import dev.kazusato.k8sbook.simplebatch.repostiory.LocationRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SimpleBatchOnK8sApplication implements CommandLineRunner {

    @Autowired
    private LocationRepository repo;

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleBatchOnK8sApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SimpleBatchOnK8sApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("==== BATCH START ====");

        final List<LocationEntity> locationList = repo.findAll();
        for (LocationEntity loc : locationList) {
            LOGGER.info("[LOCATION] " + loc.getLocationName());
        }

        LOGGER.info("==== BATCH END ====");
    }
}
