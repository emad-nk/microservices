package com.microservices.limitsservice.controller;

import com.microservices.limitsservice.configuration.Configuration;
import com.microservices.limitsservice.datatransferobject.LimitConfigurationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfigurationDTO getLimitsFromConfigurations() {
        return new LimitConfigurationDTO(configuration.getMaximum(), configuration.getMinimum());
    }
}
