package io.gulfbit.petclinc.web.controllers;

import io.gulfbit.petclinc.data.model.Vet;
import io.gulfbit.petclinc.data.services.VetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/pet-clinic/vets")
@RestController
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping({"", "/"})
    public Set<Vet> getAllVets() {
        return vetService.findAll();
    }

}
