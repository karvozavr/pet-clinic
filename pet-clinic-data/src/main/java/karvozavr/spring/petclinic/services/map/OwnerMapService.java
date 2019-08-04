package karvozavr.spring.petclinic.services.map;

import karvozavr.spring.petclinic.model.Owner;
import karvozavr.spring.petclinic.services.CrudService;

public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }
}
