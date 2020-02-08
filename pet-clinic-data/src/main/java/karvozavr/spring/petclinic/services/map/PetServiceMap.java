package karvozavr.spring.petclinic.services.map;

import karvozavr.spring.petclinic.model.Pet;
import karvozavr.spring.petclinic.services.CrudService;
import karvozavr.spring.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
