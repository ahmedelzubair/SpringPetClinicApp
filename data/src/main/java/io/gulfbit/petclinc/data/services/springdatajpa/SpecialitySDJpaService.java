package io.gulfbit.petclinc.data.services.springdatajpa;

import io.gulfbit.petclinc.data.model.Speciality;
import io.gulfbit.petclinc.data.repositories.SpecialtyRepository;
import io.gulfbit.petclinc.data.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Speciality save(Speciality obj) {
        return specialtyRepository.save(obj);
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> vets = new HashSet<>();
        specialtyRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public void delete(Speciality object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);
    }
}
