package CalculadoraModular;

public class Multiplicacao extends Calculadora
{
    public Multiplicacao(double numero1, double numero2)
    {
        super(numero1, numero2);

    }

    public double contaMultiplicacao()
    {
        return getNumero1()*getNumero2();
    }
}
