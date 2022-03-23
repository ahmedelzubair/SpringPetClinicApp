package io.gulfbit.petclinc.data.repositories;

import io.gulfbit.petclinc.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
