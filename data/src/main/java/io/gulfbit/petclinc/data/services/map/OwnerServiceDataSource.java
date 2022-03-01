package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.Owner;
import io.gulfbit.petclinc.data.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceDataSource extends GenericDataSourceService<Owner, Long> implements OwnerService {


    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public Set<Owner> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner obj) {
        super.delete(obj);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner getByLastName(String lastName) {
        return null;
    }
}
