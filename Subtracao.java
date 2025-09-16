package CalculadoraModular;

public class Subtracao extends Calculadora
{

    public Subtracao(double numero1, double numero2)
    {
        super(numero1, numero2);

    }

    public double contaSubtracao()
    {
        return getNumero1()-getNumero2();
    }
}
