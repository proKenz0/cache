package com.example.cachetutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheService {
    @Autowired
    private CacheRepository cacheRepository;

//    @Cacheable(cacheNames = "dataCache")
    @Cacheable(cacheNames = "dataCache", cacheManager = "scopeRequestCacheManager")
    public String findAll(String param) {
        System.out.println("Getting data from db . . .");
        cacheRepository.findAll();
        System.out.println("We got data from db . . .");

        return "Data: " + param;
    }
}
