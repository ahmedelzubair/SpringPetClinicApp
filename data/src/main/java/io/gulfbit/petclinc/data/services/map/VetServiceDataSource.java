package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.Vet;
import io.gulfbit.petclinc.data.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class VetServiceDataSource extends GenericDataSourceService<Vet, Long> implements VetService {
    public VetServiceDataSource() {
    }

    @Override
    public Vet save(Vet obj) {
        return super.save(obj);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet obj) {
        super.delete(obj);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
