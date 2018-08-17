package com.malachigray.sfgpetclinic.services;

import com.malachigray.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(login id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
