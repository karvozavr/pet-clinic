package karvozavr.spring.petclinic.services.map;

import karvozavr.spring.petclinic.model.Vet;
import karvozavr.spring.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}