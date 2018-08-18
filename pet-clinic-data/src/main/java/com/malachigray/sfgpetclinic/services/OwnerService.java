package com.malachigray.sfgpetclinic.services;

import com.malachigray.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerService extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
