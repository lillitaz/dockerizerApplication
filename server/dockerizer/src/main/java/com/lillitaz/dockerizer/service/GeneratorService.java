package com.lillitaz.dockerizer.service;

import com.lillitaz.dockerizer.model.Configuration;
import org.springframework.stereotype.Service;

@Service
public class GeneratorService {
    public String generate(Configuration configuration) {
        return "This is a generated Dockerfile with this configuration: " + configuration.getInformation() + "";
    }
}
