package org.spring.example.spring;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author Dzmitry Dziokin
 */
@Component
public class TestBean1 implements Serializable, Comparable<TestBean1> {

    public void hello() {
        System.out.println("Hello!");
    }

    @Override
    public int compareTo(TestBean1 o) {
        return 0;
    }
}
