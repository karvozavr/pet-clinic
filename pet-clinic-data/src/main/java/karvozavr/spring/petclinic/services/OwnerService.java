package karvozavr.spring.petclinic.services;

import karvozavr.spring.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
