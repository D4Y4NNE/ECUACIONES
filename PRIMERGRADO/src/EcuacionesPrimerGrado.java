public class EcuacionesPrimerGrado
{
    double a;
    double b;

    public double obtenerA()
    {
        return a;
    }

    public void establecerA(double datoA)
    {
        a = datoA;
    }

    public double obtenerB()
    {
        return b;
    }

    public void establecerB(double datoB)
    {
        b = datoB;
    }

    public double solucion()
    {
        double x;

        x = -obtenerB() / obtenerA();

        return x;
    }

    public void mostarDatos()
    {
        System.out.println(obtenerA());
        System.out.println(obtenerB());
        System.out.println(solucion());
    }
}
