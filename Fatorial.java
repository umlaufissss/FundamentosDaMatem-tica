package CalculadoraModular;

public class Fatorial extends Calculadora
{
    public Fatorial(double numero1, double numero2)
    {
        super(numero1, numero2);
    }

    public double fatorar()
    {
        double fator = 1;

        for(int i=2;i<=getNumero1();i++)
        {
            fator = fator*i;
        }

        return fator;
    }
}
