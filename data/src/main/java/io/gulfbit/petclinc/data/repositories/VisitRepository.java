package io.gulfbit.petclinc.data.repositories;

import io.gulfbit.petclinc.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
