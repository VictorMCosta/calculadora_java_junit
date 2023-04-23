package teste_calculadora_java;

public class Calculadora {

	public double soma(double numeroUm, double numeroDois) {
        return numeroUm + numeroDois;
    }

    public double subtrair(double numeroUm, double numeroDois) {
        return numeroUm - numeroDois;
    }

    public double multiplicar(double numeroUm, double numeroDois) {
        return numeroUm * numeroDois;
    }

    public double dividir(double numeroUm, double numeroDois) {
        if (numeroDois == 0) {
        }
        return numeroUm / numeroDois;
    }

    public double potenciar(double numeroUm, double numeroDois) {
        return Math.pow(numeroUm, numeroDois);
    }

}