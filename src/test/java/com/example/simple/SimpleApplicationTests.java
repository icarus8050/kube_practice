package com.example.simple;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = "my.name=hey")
class SimpleApplicationTests {

    @Test
    void contextLoads() {
    }

}
