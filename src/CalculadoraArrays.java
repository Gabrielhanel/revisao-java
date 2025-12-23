/*
Dado um array de inteiros, calcule:
Soma
Média
Maior valor
*/

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CalculadoraArrays {
    public static void main(String[] args) {
        int[] NumerosEscolhidos = {5, 8, 4, 3, 9, 7};

        OptionalDouble Media = Arrays.stream(NumerosEscolhidos).average();
        System.out.println(STR."Média: \{Media.getAsDouble()}");

        int Soma = Arrays.stream(NumerosEscolhidos).sum();
        System.out.println(STR."Soma: \{Soma}");

        OptionalInt MaiorNumero = Arrays.stream(NumerosEscolhidos).max();
        System.out.println(STR."Maior número: \{MaiorNumero.getAsInt()}");
    }
}