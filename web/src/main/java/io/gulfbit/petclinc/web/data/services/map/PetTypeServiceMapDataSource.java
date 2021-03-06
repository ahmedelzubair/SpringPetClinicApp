package io.gulfbit.petclinc.web.data.services.map;

import io.gulfbit.petclinc.web.data.model.PetType;
import io.gulfbit.petclinc.web.data.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map_datasource"})
public class PetTypeServiceMapDataSource extends HashMapDataSourceService<PetType, Long> implements PetTypeService {


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
    public void delete(PetType object) {
        super.delete(object);
    }
}
