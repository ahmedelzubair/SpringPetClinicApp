package io.gulfbit.petclinc.web.data.repositories;

import io.gulfbit.petclinc.web.data.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
