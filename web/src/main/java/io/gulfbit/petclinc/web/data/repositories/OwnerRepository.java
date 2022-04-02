package io.gulfbit.petclinc.web.data.repositories;

import io.gulfbit.petclinc.web.data.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner getByLastName(String lastName);
}
