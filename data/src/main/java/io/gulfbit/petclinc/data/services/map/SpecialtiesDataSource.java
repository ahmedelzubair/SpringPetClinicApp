package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.Speciality;
import io.gulfbit.petclinc.data.services.SpecialityService;

import java.util.Set;

public class SpecialtiesDataSource extends GenericDataSourceService<Speciality, Long> implements SpecialityService {
    @Override
    public Speciality save(Speciality obj) {
        return super.save(obj);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Speciality> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality obj) {
        super.delete(obj);
    }
}
