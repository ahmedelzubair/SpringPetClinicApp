package io.gulfbit.petclinc.data.repositories;

import io.gulfbit.petclinc.data.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
