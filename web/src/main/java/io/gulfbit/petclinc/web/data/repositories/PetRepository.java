package io.gulfbit.petclinc.web.data.repositories;

import io.gulfbit.petclinc.web.data.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
