package com.luxfacta;

import org.junit.Assert;
import org.junit.Test;

public class LuxfactaTest {

    @Test
    public void numberDivisibleByThreeAndFiveTest() {
        Luxfacta luxfacta = new Luxfacta(15);
        Assert.assertEquals("LuxFacta", luxfacta.say());
    }
}
