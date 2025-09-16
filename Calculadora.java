package CalculadoraModular;

public class Calculadora
{
    private double numero1;
    private double numero2;

    public Calculadora(double numero1, double numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1()
    {
        return numero1;
    }

    public double getNumero2()
    {
        return numero2;
    }

    public void setNumero1(double newone)
    {
        this.numero1 = newone;
    }

    public void setNumero2(double newtwo)
    {
        this.numero2 = newtwo;
    }
}
