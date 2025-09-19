package CalculadoraModular;

import java.math.MathContext;

public class EquacaoSegundoGrau extends Calculadora
{
    private double numero3;
    private double resultado;

    static Math MATH;

    public EquacaoSegundoGrau(double numero1, double numero2, double numero3, double resultado)
    {
      super(numero1, numero2);

      this.numero3 = numero3;
      this.resultado = resultado;
    }

    public double getNumero3()
    {
        return numero3;
    }

    public double getResultado()
    {
        return resultado;
    }

    public String EncontreX()
    {
        double valorDelta, X1, X2;

        if(getResultado()>=0)
        {
            valorDelta = getNumero2() * getNumero2() - 4*getNumero1()*(getNumero3()-getResultado());
        }
        else
        {
            valorDelta = getNumero2() * getNumero2() - 4*getNumero1()*(getNumero3()+getResultado());
        }

        if(valorDelta >0)
        {
            X1 = (-(getNumero2()) + Math.sqrt(valorDelta))/2*getNumero1();
            X2 = (-(getNumero2()) - Math.sqrt(valorDelta))/2*getNumero1();

            return "X' = " + X1 + " || X'' = " + X2;
        }
        else if(valorDelta<0)
        {
            return "Valor negativo, não há possibilidade de X";
        }
        else
        {
            X1 = -(getNumero2())/2*getNumero1();
            
            return "X' = " + X1;
        }
    }
}
