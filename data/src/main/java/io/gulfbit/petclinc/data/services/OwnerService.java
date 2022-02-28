package io.gulfbit.petclinc.data.services;

//import io.gulfbit.petclinic.data.model.Owner;

import io.gulfbit.petclinc.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner getByLastName(String lastName);

}
