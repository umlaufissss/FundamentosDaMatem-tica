package CalculadoraModular;

public class FuncaoTrigonometrica extends Calculadora
{
    static Math MATH;

    private double angulo;

    public FuncaoTrigonometrica(double numero1, double numero2, double angulo)
    {
        super(numero1, numero2);

        this.angulo = angulo;
    }

    public double getAngulo()
    {
        return angulo;
    }

    public String Angulo()
    {
        double sin, cos, tan;

        sin = Math.toRadians(getAngulo());
        cos = Math.toRadians(getAngulo());
        tan = Math.toRadians(getAngulo());

        sin = Math.sin(sin);
        cos = Math.cos(cos);
        tan = Math.tan(tan);

        return "Cosseno = " +cos+ " || Seno = " +sin+ " || Tangente = " +tan;
    }
}
