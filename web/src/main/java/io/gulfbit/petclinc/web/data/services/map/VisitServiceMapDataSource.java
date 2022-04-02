package io.gulfbit.petclinc.web.data.services.map;

import io.gulfbit.petclinc.web.data.model.Visit;
import io.gulfbit.petclinc.web.data.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map_datasource"})
public class VisitServiceMapDataSource extends HashMapDataSourceService<Visit, Long> implements VisitService {

    @Override
    public Visit save(Visit object) {
        if (object.getPet() == null || object.getPet().getId() == null || object.getPet().getOwner() == null
                || object.getPet().getOwner().getId() == null)
            throw new RuntimeException("Invalid visit");

        return super.save(object);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findByAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
