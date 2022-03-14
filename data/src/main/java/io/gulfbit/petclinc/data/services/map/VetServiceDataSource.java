package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.Speciality;
import io.gulfbit.petclinc.data.model.Vet;
import io.gulfbit.petclinc.data.services.SpecialityService;
import io.gulfbit.petclinc.data.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceDataSource extends GenericDataSourceService<Vet, Long> implements VetService {
    private final SpecialityService specialtyService;

    public VetServiceDataSource(SpecialityService specialtyService) {
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
