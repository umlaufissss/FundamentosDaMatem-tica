package CalculadoraModular;

public class Divisao extends Calculadora
{

    public Divisao(double numero1, double numero2)
    {
        super(numero1, numero2);

    }

    public double contaDivisao()
    {
        return getNumero1()/getNumero2();
    }
}
