package io.gulfbit.petclinc.data.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    private final Map<ID, T> map = new HashMap<>();

    T save(ID id, T obj) {
        map.put(id, obj);
        return obj;
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


}
