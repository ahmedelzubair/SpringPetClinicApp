package io.gulfbit.petclinc.data.repositories;

import io.gulfbit.petclinc.data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
