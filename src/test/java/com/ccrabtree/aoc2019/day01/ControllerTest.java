package com.ccrabtree.aoc2019.day01;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControllerTest {

    @Test
    public void calculateMass_ValidInput_CalculatesCorrectly() {
        assertEquals(2, Controller.calculateMass(12));
        assertEquals(2, Controller.calculateMass(14));
        assertEquals(654, Controller.calculateMass(1969));
        assertEquals(33583, Controller.calculateMass(100756));
    }
}
