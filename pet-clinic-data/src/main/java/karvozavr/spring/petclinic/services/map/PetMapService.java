package karvozavr.spring.petclinic.services.map;

import karvozavr.spring.petclinic.model.Pet;
import karvozavr.spring.petclinic.services.CrudService;

public class PetMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
