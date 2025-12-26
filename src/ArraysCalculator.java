/*
Dado um array de inteiros, calcule:
Soma
Média
Maior valor
*/

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ArraysCalculator {
    public static void main(String[] args) {
        int[] RandomNumbers  = {5, 8, 4, 3, 9, 7};

        OptionalDouble AverageCalculation = Arrays.stream(RandomNumbers).average();
        System.out.println(STR."Average: \{AverageCalculation.getAsDouble()}");

        int SumCalculation = Arrays.stream(RandomNumbers).sum();
        System.out.println(STR."Sum: \{SumCalculation}");

        OptionalInt HighestNumberFound = Arrays.stream(RandomNumbers).max();
        System.out.println(STR."Highest Number: \{HighestNumberFound.getAsInt()}");
    }
}