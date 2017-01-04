package com.example.refection;

import org.junit.Test;
import org.springframework.test.util.ReflectionTestUtils;

/**
 * Created by longkeyu on 2016/12/22.
 */
public class ReflectionTest {
    @Test
    public void testField(){
        Sample sample = new Sample();
        ReflectionTestUtils.setField(sample, "id", 1);
        ReflectionTestUtils.setField(sample, "name", "");
    }
}
