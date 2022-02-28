package io.gulfbit.petclinc.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/owners")
@RestController
public class OwnerController {

    @RequestMapping({"","/", "/index", "/index.html"})
    public String index() {
        return "owners/index";
    }

}
