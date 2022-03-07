package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.PetType;
import io.gulfbit.petclinc.data.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceDataSource extends GenericDataSourceService<PetType, Long> implements PetTypeService {
    @Override
    public PetType save(PetType obj) {
        return super.save(obj);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<PetType> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType obj) {
        super.delete(obj);
    }
}
