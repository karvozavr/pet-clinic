package karvozavr.spring.petclinic.bootstrap;

import karvozavr.spring.petclinic.model.Owner;
import karvozavr.spring.petclinic.model.Vet;
import karvozavr.spring.petclinic.services.OwnerService;
import karvozavr.spring.petclinic.services.VetService;
import karvozavr.spring.petclinic.services.map.OwnerServiceMap;
import karvozavr.spring.petclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setFirstName("Michael");

        ownerService.save(owner);

        Vet vet = new Vet();
        owner.setId(1L);
        owner.setFirstName("Michael");
        owner.setFirstName("Michael");

        vetService.save(vet);
    }
}
