package org.li.springboot_examples.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {
    @Test
    public void run1(){
        System.out.println("run test demo");
    }
}
