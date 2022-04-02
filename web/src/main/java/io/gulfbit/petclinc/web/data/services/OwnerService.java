package io.gulfbit.petclinc.web.data.services;

//import io.gulfbit.petclinic.data.model.Owner;

import io.gulfbit.petclinc.web.data.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner getByLastName(String lastName);

}
