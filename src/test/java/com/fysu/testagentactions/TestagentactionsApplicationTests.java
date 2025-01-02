package com.fysu.testagentactions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestagentactionsApplicationTests {

        @Test
        void contextLoads() {
        }

        @Test
        void testHello() {
                HelloController helloController = new HelloController();
                String result = helloController.hello("World");
                assertEquals("Hello, World!", result);
        }

}
