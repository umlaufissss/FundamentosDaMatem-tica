package CalculadoraModular;

public class Radiciacao extends Calculadora
{
    public Radiciacao(double numero1, double numero2)
    {
        super(numero1, numero2);
    }

    public double contaRadiciacao()
    {
        double num = getNumero1();
        double preciso = 0.00001;
        double nom = 1;

        while (num - nom > preciso)
        {
            num = (num + nom) / 2;
            nom = getNumero1()/ num;
        }

        return num;
    }
}
