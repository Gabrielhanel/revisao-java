//Crie um método que receba um número inteiro e retorne:
// "Par" se for par
// "Ímpar" se for ímpar

public class EvenOrOdd {
    public String CheckIfNumberIsEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}