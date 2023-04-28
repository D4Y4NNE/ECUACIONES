public class Main
{
    public static void main(String args[])
    {
        EcuacionSegundoGrado.establecerA(1);
        System.out.println(EcuacionSegundoGrado.obtenerA());

        EcuacionSegundoGrado.establecerB(2);
        System.out.println(EcuacionSegundoGrado.obtenerB());

        EcuacionSegundoGrado.establecerC(-8);
        System.out.println(EcuacionSegundoGrado.obtenerC());

        EcuacionSegundoGrado.discriminante();
        EcuacionSegundoGrado.raiz();
    }
}