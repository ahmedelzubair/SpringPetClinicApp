package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.Pet;
import io.gulfbit.petclinc.data.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceDataSource extends GenericDataSourceService<Pet, Long> implements PetService {


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
