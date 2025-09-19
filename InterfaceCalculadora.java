package CalculadoraModular;

import java.util.Scanner;

public class InterfaceCalculadora
{
    static Scanner SC = new Scanner(System.in);
    static int vezesFeitas = 0;
    static double result = 0;

    public static void main(String[] args)
    {
        inicio();
    }

    public static void inicio()
    {

        System.out.println("==========================");
        System.out.println("        BEM-VINDO!");
        System.out.println("=========================");

        System.out.println("\nVocê está em uma calculadora!\nAqui nós temos algumas opções\nde contas, digite abaixo qual\nopção você gostaria de fazer:\n");

        operacoes();

    }

    public static void operacoes()
    {
        int opcao, op;

        System.out.println("[1] - Adição\n[2] - Subtração\n[3] - Divisão\n[4] - Multiplicação\n[5] - Potenciação\n[6] - Radiciação\n[7] - Fatorial");
        System.out.println("[8] - Modulo\n[9] - Máximo Divisor Comum\n[10] - Minimo Multiplo comum\n[11] - Equação de Primeiro Grau");
        System.out.println("[12] - Equação do Segundo Grau\n[13] - Funções Trigonométricas\n[0] - Sair");
        opcao = SC.nextInt();
        SC.nextLine();

        switch (opcao)

        {
            case 1:
                contaAdicao();
                break;

            case 2:
                contaSubtracao();
                break;

            case 3:
                contaDivisao();
                break;

            case 4:
                contaMultiplicacao();
                break;

            case 5:
                contaPotenciacao();
                break;

            case 6:
                contaRadiciacao();
                break;

            case 7:
                contaFatorial();
                break;

            case 8:
                contaModulo();
                break;

            case 9:
                contaMCD();
                break;

            case 10:
                contaMMC();
                break;

            case 11:
                System.out.println("Contas anteriores não serão lembradas pela calculadora,\ntampouco o resultado dessa conta...\nTem certeza que gostaria de continuar?[1] - Sim\n[2] - Não");
                op = SC.nextInt();
                SC.nextLine();

                if (op == 1)
                {
                    contaPrimeiroGrau();
                    result = 0;
                }
                else
                {
                    inicio();
                }
                break;

            case 12:
                System.out.println("Contas anteriores não serão lembradas pela calculadora,\ntampouco o resultado dessa conta...\nTem certeza que gostaria de continuar?[1] - Sim\n[2] - Não");
                op = SC.nextInt();
                SC.nextLine();

                if (op == 1)
                {
                    contaSegundoGrau();
                    result = 0;
                }
                else
                {
                    inicio();
                }
                break;

            case 13:
                System.out.println("Contas anteriores não serão lembradas pela calculadora,\ntampouco o resultado dessa conta...\nTem certeza que gostaria de continuar?[1] - Sim\n[2] - Não");
                op = SC.nextInt();
                SC.nextLine();

                if (op == 1)
                {
                    funcoesTrigonometricas();
                    result = 0;
                }
                else
                {
                    inicio();
                }
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida...\nTente novamente");
                inicio();
        }
        continuar();
    }

    public static void contaAdicao()
    {
        double num = 0, nom;

        System.out.println("==========================");
        System.out.println("          ADIÇÃO");
        System.out.println("==========================");

        if(vezesFeitas == 0)
        {
            System.out.println("Digite 1° número: " );

            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        System.out.println("Digite o 2° número: ");
        nom = SC.nextDouble();
        SC.nextLine();

        Adicao adicao = new Adicao(num, nom);

        result = adicao.contaAdicao();

        System.out.println("---------------------------");

        System.out.println(num +" + "+ nom + " = " + result);

    }

    public static void contaSubtracao()
    {
        double num = 0, nom;

        System.out.println("===========================");
        System.out.println("         SUBTRAÇÃO");
        System.out.println("===========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite 1° número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        System.out.println("Digite o 2° número: ");
        nom = SC.nextDouble();
        SC.nextLine();

        Subtracao subtracao = new Subtracao(num, nom);

        result = subtracao.contaSubtracao();

        System.out.println("--------------------------");

        System.out.println(num +" - "+ nom + " = " + result);

    }

    public static void contaDivisao()
    {
        double num = 0, nom;

        System.out.println("===========================");
        System.out.println("          DIVISÃO");
        System.out.println("============================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite 1° número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        System.out.println("Digite o 2° número: ");
        nom = SC.nextDouble();
        SC.nextLine();

        if(nom == 0)
        {
            System.out.println("Número inválido!\nNada pode ser dívisivel por 0;\nTente novamente...");
            SC.nextLine();
            contaDivisao();
        }

        Divisao divisao = new Divisao(num, nom);

        result = divisao.contaDivisao();

        System.out.println("--------------------------");

        System.out.println(num +" / "+ nom + " = " + result);

    }

    public static void contaMultiplicacao()
    {
        double num = 0, nom;

        System.out.println("=========================");
        System.out.println("      MULTIPLICAÇÃO");
        System.out.println("==========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite 1° número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        System.out.println("Digite o 2° número: ");
        nom = SC.nextDouble();
        SC.nextLine();

        Multiplicacao multiplicacao = new Multiplicacao(num, nom);

        result = multiplicacao.contaMultiplicacao();

        System.out.println("--------------------------");

        System.out.println(num +" * "+ nom + " = " + result);

    }

    public static void contaPotenciacao()
    {
        double num = 1, nom;
        System.out.println("=========================");
        System.out.println("       POTENCIAÇÃO       ");
        System.out.println("=========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite o número que será a base: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        System.out.println("Digite o número que será o expoente: ");
        nom = SC.nextDouble();
        SC.nextLine();

        Potenciacao potenciacao = new Potenciacao(num, nom);

        result += potenciacao.contaPotenciacao();

        System.out.println("--------------------------");

        System.out.println(num +" ^ "+ nom + " = " + result);

    }

    public static void contaRadiciacao()
    {

        double num = 0, nom = 0;

        System.out.println("===========================");
        System.out.println("         RADICIAÇÃO");
        System.out.println("===========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite 1° número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        Radiciacao radiciacao = new Radiciacao(num, nom);


        result = radiciacao.contaRadiciacao();

        System.out.println("---------------------------");

        System.out.println(num+"^(1/2) = " + result);

    }

    public static void contaFatorial()
    {

        double num = 0, nom = 0;

        System.out.println("==========================");
        System.out.println("         FATORIAL");
        System.out.println("==========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite o número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        Fatorial fatorial = new Fatorial(num, nom);


        result = fatorial.fatorar();

        System.out.println("---------------------------");

        System.out.println(num + "! = " + result);

    }

    public static void contaModulo()
    {

        double num = 0, nom = 0;

        System.out.println("==========================");
        System.out.println("          MODULO");
        System.out.println("==========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite o número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }

        Modulo modulo = new Modulo(num, nom);


        result = modulo.modulo();

        System.out.println("---------------------------");

        System.out.println("|"+ num+"| = " + result);

    }

    public static void contaMCD()
    {

        double num = 0, nom = 0;

        System.out.println("==========================");
        System.out.println("   MAXIMO DIVISOR COMUM");
        System.out.println("==========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite o primeiro número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }
        System.out.println("Digite o segundo número:");
        nom = SC.nextDouble();
        SC.nextLine();

        MaximoDivisorComum mdc = new MaximoDivisorComum(num, nom);

        result = mdc.MDC();

        System.out.println("---------------------------");

        System.out.println("O máximo divisor comum de " +num+ " e "+nom+ " é = " + result);

    }

    public static void contaMMC()
    {

        double num = 0, nom = 0;

        System.out.println("===========================");
        System.out.println("   MINIMO MULTIPLO COMUM");
        System.out.println("===========================");

        if(vezesFeitas ==0)
        {
            System.out.println("Digite o primeiro número: " );
            num = SC.nextDouble();
            SC.nextLine();
        }
        else
        {
            num = result;
        }
        System.out.println("Digite o segundo número:");
        nom = SC.nextDouble();
        SC.nextLine();

        MinimoMultiploComum mmc = new MinimoMultiploComum(num, nom);

        result = mmc.MMC();

        System.out.println("---------------------------");

        System.out.println("O máximo divisor comum de " +num+ " e "+nom+ " é = " + result);

    }

    public static void contaPrimeiroGrau()
    {

        double a, b, resultado;
        char op;

        System.out.println("==========================");
        System.out.println(" EQUAÇÃO DO PRIMEIRO GRAU");
        System.out.println("==========================");

        System.out.println("Digite o valor A: " );
        a = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite qual operação irá usar:");
        do
        {
            op = SC.next().charAt(0);
        }while (!(op == '+' || op == '-' || op == '*' || op == '/'));


        System.out.println("Digite o valor B:");
        b = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite o resultado:");
        resultado = SC.nextDouble();
        SC.nextLine();

        EquacaoPrimeiroGrau E1G = new EquacaoPrimeiroGrau(a, b, resultado, op);

        System.out.println(a+"x " +op+ " " +b+ " = " +resultado);
        double valorDX = E1G.EncontrarX();

        System.out.println("---------------------------");

        System.out.println("X = " + valorDX);

    }

    public static void contaSegundoGrau()
    {

        double a, b, c, resultado;

        System.out.println("=========================");
        System.out.println(" EQUAÇÃO DO SEGUNDO GRAU");
        System.out.println("=========================");

        System.out.println("Digite o valor A: " );
        a = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite o valor B:");
        b = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite o valor C:");
        c = SC.nextDouble();
        SC.nextLine();

        System.out.println("Digite o resultado:");
        resultado = SC.nextDouble();
        SC.nextLine();

        EquacaoSegundoGrau E2G = new EquacaoSegundoGrau(a, b, c, resultado);

        System.out.println(a+"x^2 " +b+ "x " +c+ " = " +resultado);
        String valorDX = E2G.EncontreX();

        System.out.println("---------------------------");

        System.out.println("X = " + valorDX);

    }

    public static void funcoesTrigonometricas()
    {

        double angulo, num = 0, nom = 0;

        System.out.println("=========================");
        System.out.println("  FUNÇÃO TRIGONOMETRICA");
        System.out.println("=========================");

            System.out.println("Digite o valor do ângulo: ");
            angulo = SC.nextDouble();
            SC.nextLine();

            FuncaoTrigonometrica Tri = new FuncaoTrigonometrica(nom, num, angulo);

            String valoresAngulos = Tri.Angulo();

            System.out.println("---------------------------");

            System.out.println(valoresAngulos);

    }

    public static void continuar()
    {
        int opc;
        vezesFeitas++;

        System.out.println("\nGostaria de continuar seu cálculo?");
        System.out.println("1 - Sim\n2 - Não");
        opc = SC.nextInt();
        SC.nextLine();

        if(opc == 2)
        {
            result = 0;
            vezesFeitas = 0;
        }
        else if(opc !=1)
        {
            System.out.println("Resposta inválida!\nTente novamente;");
            continuar();
        }

        inicio();
    }
}