package com.github.sgrillon14.javanowtested.service;

import java.time.Clock;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MySampleService {

    @Autowired
    private Clock clock;

    public LocalDateTime sample() {
        return LocalDateTime.now(clock);
    }

    // setter for Mock
    protected void setClock(Clock clock) {
        this.clock = clock;
    }
}
