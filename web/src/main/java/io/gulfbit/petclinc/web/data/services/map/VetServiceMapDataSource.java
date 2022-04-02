package io.gulfbit.petclinc.web.data.services.map;

import io.gulfbit.petclinc.web.data.model.Speciality;
import io.gulfbit.petclinc.web.data.model.Vet;
import io.gulfbit.petclinc.web.data.services.SpecialityService;
import io.gulfbit.petclinc.web.data.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map_datasource"})
public class VetServiceMapDataSource extends HashMapDataSourceService<Vet, Long> implements VetService {
    private final SpecialityService specialtyService;

    public VetServiceMapDataSource(SpecialityService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet object) {
        if (object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpecialty = specialtyService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(object);
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
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
