public class EcuacionSegundoGrado
{
    private static double a;
    private static double b;
    private static double c;


    public static double obtenerA()
    {
        return a;
    }

    public static void establecerA(double numA)
    {
        a = numA;
    }

    public static double obtenerB()
    {
        return b;
    }

    public static void establecerB(double numB)
    {
        b = numB;
    }

    public static double obtenerC()
    {
        return c;
    }

    public static void establecerC(double numC)
    {
        c = numC;
    }

    public static double discriminante()
    {
        double expresion;

        expresion = Math.pow(obtenerB(), 2) - 4 * obtenerA() * obtenerC();

        return expresion;
    }

    public static double raiz()
    {
        double raiz1;

        if (discriminante() > 0)
        {
            System.out.println("Dos soluciones diferentes");

            double raiz2;

            raiz1 = (-obtenerB() + Math.sqrt(discriminante())) / 2 * obtenerA()*obtenerC();
            raiz2 = (-obtenerB() + Math.sqrt(discriminante())) / 2 * obtenerA()*obtenerC();

            System.out.println(raiz1);
            System.out.println(raiz2);

        }
        else if (discriminante() == 0)
        {
            System.out.println("Una solucion doble");

            raiz1 = (-obtenerB() / 2 * obtenerA());
            System.out.println(raiz1);
        }
        else
        {
            System.out.println("No hay solucion");
        }
        return 0;
    }
}