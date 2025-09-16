package CalculadoraModular;

public class MinimoMultiploComum extends Calculadora
{
    public MinimoMultiploComum(double numero1, double numero2)
    {
        super(numero1, numero2);
    }

    public double MMC()
    {
        int posicao = 2;
        double minimo = 1;
        boolean continua = false;

        for(int i = 1; i<posicao; i++)
        {
            for(int j = 0; j<getNumero2(); j++)
            {
                if(getNumero1()*j == getNumero2()*i)
                {
                    minimo = getNumero1()*j;
                    continua = true;
                }
            }
            posicao++;
            if(continua)
            {
                break;
            }
        }
        return minimo;
    }
}
