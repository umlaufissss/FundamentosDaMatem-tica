package CalculadoraModular;

public class MaximoDivisorComum extends Calculadora
{
    public MaximoDivisorComum(double numero1, double numero2)
    {
        super(numero1, numero2);
    }

    public double MDC()
    {
        double maximo = 1, pare;

        if(getNumero1()>getNumero2())
        {
            pare = getNumero1();
        }
        else
        {
            pare = getNumero2();
        }

        for(int i = 0; i<=pare;i++)
        {
            if(getNumero1()%i==0 && getNumero2()%i==0)
            {
                maximo = i;
            }
        }
        return maximo;
    }
}
