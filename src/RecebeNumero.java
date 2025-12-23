//Crie um método que receba um número inteiro e retorne:
// "Par" se for par
// "Ímpar" se for ímpar

public class RecebeNumero {
    public String VerificaParOuImpar(int numero) {
        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }
}