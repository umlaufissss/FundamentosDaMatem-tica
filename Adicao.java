package CalculadoraModular;

public class Adicao extends Calculadora
{

    public Adicao(double numero1, double numero2)
    {
        super(numero1, numero2);

    }

    public double contaAdicao()
    {
        return getNumero1()+getNumero2();
    }
}
