package io.gulfbit.petclinc.web.data.services.map;

import io.gulfbit.petclinc.web.data.model.Speciality;
import io.gulfbit.petclinc.web.data.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map_datasource"})
public class SpecialtiesMapDataSource extends HashMapDataSourceService<Speciality, Long> implements SpecialityService {
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
    public void delete(Speciality object) {
        super.delete(object);
    }
}
