package CalculadoraModular;

public class EquacaoPrimeiroGrau extends Calculadora
{
    private double resultado;
    private char op;

    public EquacaoPrimeiroGrau(double numero1, double numero2, double resultado, char op)
    {
        super(numero1, numero2);

        this.resultado = resultado;
        this.op = op;
    }

    public double getResultado()
    {
        return resultado;
    }

    public char getOp()
    {
        return op;
    }

    public double EncontrarX()
    {
        double valorDeX, arrumarSinais;

        if(getOp() == '+')
        {
            arrumarSinais = -getNumero2();
            valorDeX = (getResultado() - arrumarSinais)/getNumero1();
        }
        else if(getOp() == '-')
        {
            arrumarSinais = getNumero2();
            if (getNumero2()>0)
            {
                arrumarSinais = -getNumero2();
            }
            valorDeX = (getResultado() +arrumarSinais)/getNumero1();
        }
        else if(getOp() == '*')
        {
            valorDeX = (getResultado() / getNumero2())/getNumero1();
        }
        else
        {
            valorDeX = (getResultado() * getNumero2())/getNumero1();
        }

        return valorDeX;
    }
}
