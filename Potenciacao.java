package CalculadoraModular;

public class Potenciacao extends Calculadora
{

    public Potenciacao(double numero1, double numero2)
    {
        super(numero1, numero2);

    }

    public double contaPotenciacao()
    {
        double numFixo = getNumero1();
        double numVarivel = 1;

        for(int i=1; i<=getNumero2();i++)
        {
            numVarivel*= numFixo;
        }

        return numVarivel;
    }
}
