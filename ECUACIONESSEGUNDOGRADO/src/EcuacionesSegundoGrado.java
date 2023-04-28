public class EcuacionesSegundoGrado
{
    public int a;
    public int b;
    public int c;

    public int obtenerA()
    {
        return a;
    }
    public void establecerA(int datoA)
    {
        a=datoA;
    }

    public int obtenerB()
    {
        return b;
    }
    public void establecerB(int datoB)
    {
        b=datoB;
    }

    public int obtenerC()
    {
        return c;
    }
    public void establecerC(int datoC)
    {
        c=datoC;
    }

    public double solucion()
    {
        double s;

        //x=Math.pow(obtenerB(),2)-4*obtenerA()*obtenerC();
        s = b * b - 4 * a * c;

        if(s>0)
        {
            double x1 = (-b + Math.sqrt(s)) / (2*a);
            double x2 = (-b - Math.sqrt(s)) / (2*a);
            System.out.println("x1 vale: " + x1);
            System.out.println("X2 vale: " + x2);
        }
        else
        {
            System.out.println("la ecuacion ingresada no tiene solucion");
        }
        return s;
    }

    public void mostarDatos()
    {
        System.out.println(obtenerA());
        System.out.println(obtenerB());
        System.out.println(obtenerC());
        System.out.println(solucion());
    }
}