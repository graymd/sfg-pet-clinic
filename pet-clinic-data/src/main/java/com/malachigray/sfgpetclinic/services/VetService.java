package com.malachigray.sfgpetclinic.services;

import com.malachigray.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(login id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}
