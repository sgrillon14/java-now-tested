package com.github.sgrillon14.javanowtested.service;

import static org.junit.Assert.assertEquals;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySampleServiceTest {

    @Autowired
    private MySampleService mySampleService;

    @Test
    public void testSample() {
        mySampleService.setClock(Clock.fixed(LocalDateTime.of(2019, 11, 28, 10, 00).toInstant(ZoneOffset.UTC), ZoneId.systemDefault()));
        assertEquals(LocalDateTime.of(2019, 11, 28, 10, 00).toInstant(ZoneOffset.UTC), mySampleService.sample());
    }

}
