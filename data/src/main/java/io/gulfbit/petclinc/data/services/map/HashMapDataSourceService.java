package io.gulfbit.petclinc.data.services.map;

import io.gulfbit.petclinc.data.model.BaseEntity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class HashMapDataSourceService<T extends BaseEntity, ID extends Long> {

    private final Map<Long, T> map = new HashMap<>();

    T save(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    T findById(ID id) {
        return map.get(id);
    }

    Set<T> findByAll() {
        return new HashSet<T>(map.values());
    }

    void deleteById(ID id) {
        map.remove(id);
    }

    void delete(T obj) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(obj));
    }

    private Long getNextId() {
        return map.size() + 1L;
    }

}
