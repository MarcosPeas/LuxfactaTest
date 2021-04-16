package com.luxfacta;

import org.junit.Assert;
import org.junit.Test;

public class LuxfactaTest {

    @Test
    public void numberDivisibleByThreeTest() {
        Luxfacta luxfacta = new Luxfacta(9);
        Assert.assertEquals("Lux", luxfacta.say());
    }

    @Test
    public void numberDivisibleByFiveTest() {
        Luxfacta luxfacta = new Luxfacta(10);
        Assert.assertEquals("Facta", luxfacta.say());
    }

    @Test
    public void numberDivisibleByThreeAndFiveTest() {
        Luxfacta luxfacta = new Luxfacta(15);
        Assert.assertEquals("LuxFacta", luxfacta.say());
    }

    @Test
    public void numberNotDivisibleByThreeOrFive() {
        Luxfacta luxfacta = new Luxfacta(13);
        Assert.assertEquals("13", luxfacta.say());
    }
}
