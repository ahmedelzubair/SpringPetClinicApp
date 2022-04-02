package io.gulfbit.petclinc.web.data.services.map;

import io.gulfbit.petclinc.web.data.model.Pet;
import io.gulfbit.petclinc.web.data.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map_datasource"})
public class PetServiceMapDataSource extends HashMapDataSourceService<Pet, Long> implements PetService {


    @Override
    public Pet save(Pet obj) {
        return super.save(obj);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
