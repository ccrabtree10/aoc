package com.ccrabtree.aoc2019.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Controller
{
    public static void main(String[] args) throws IOException
    {
        int sum1 = 0;
        int sum2 = 0;
        String line;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(ClassLoader.getSystemResourceAsStream("input_01.txt")))) {
            while ((line = reader.readLine()) != null) {
                int fuel = calculateFuel(Integer.parseInt(line));
                sum1 += fuel;
                sum2 += fuel;
                while ((fuel = calculateFuel(fuel)) > 0) {
                    sum2 += fuel;
                }
            }
        }
        assert sum1 == 3345909;
        System.out.println("Part 1: " + sum1);
        assert sum2 == 5015983;
        System.out.println("Part 2: " + sum2);
    }

    public static int calculateFuel(int mass) {
        return Math.floorDiv(mass, 3) - 2;
    }
}
