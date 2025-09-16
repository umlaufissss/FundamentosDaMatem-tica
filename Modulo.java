package CalculadoraModular;

public class Modulo extends Calculadora
{
    public Modulo(double numero1, double numero2)
    {
        super(numero1, numero2);
    }

    public double modulo()
    {
        double modulo = getNumero1();

        if(getNumero1()<0)
        {
            modulo = getNumero1()*-2;
        }
        return modulo;
    }
}
