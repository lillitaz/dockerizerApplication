package com.lillitaz.dockerizer.controller;

import com.lillitaz.dockerizer.model.Configuration;
import com.lillitaz.dockerizer.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class GenerateController {


    private final GeneratorService generatorService;

    @Autowired
    public GenerateController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @PostMapping("/generate")
    public String generate(@RequestBody Configuration configuration) {
        return generatorService.generate(configuration);
    }
}
