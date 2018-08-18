package com.malachigray.sfgpetclinic.services;

import com.malachigray.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
