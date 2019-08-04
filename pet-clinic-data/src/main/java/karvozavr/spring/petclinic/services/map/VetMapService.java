package karvozavr.spring.petclinic.services.map;

import karvozavr.spring.petclinic.model.Vet;
import karvozavr.spring.petclinic.services.CrudService;

public class VetMapService extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}