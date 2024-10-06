package com.example.cachetutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {
    @Autowired
    private CacheService cacheService;

    @GetMapping("/data")
    public String findAll(String param) {
        return cacheService.findAll(param) + cacheService.findAll(param) + cacheService.findAll(param);
    }
}
