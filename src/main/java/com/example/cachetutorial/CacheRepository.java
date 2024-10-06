package com.example.cachetutorial;

import org.springframework.stereotype.Repository;

@Repository
public class CacheRepository {
    // sleep for 2 seconds
    public void findAll() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
