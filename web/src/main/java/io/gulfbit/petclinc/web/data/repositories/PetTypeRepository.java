package io.gulfbit.petclinc.web.data.repositories;

import io.gulfbit.petclinc.web.data.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
