package com.malachigray.sfgpetclinic.services;

import com.malachigray.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(login id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
