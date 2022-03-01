package io.gulfbit.petclinc.web.controllers;

import io.gulfbit.petclinc.data.model.Owner;
import io.gulfbit.petclinc.data.services.OwnerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/pet-clinic/owners")
@RestController
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"", "/"})
    public Set<Owner> getAllOwners() {
        return ownerService.findAll();
    }

}
