package dev.kazusato.k8sbook.simplebatch.repostiory;

import dev.kazusato.k8sbook.simplebatch.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Long> {
}
