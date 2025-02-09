public class primitivoFloat {
    public static void main(String[] args) {
        float realFloat = 1.5e-10f; //1.5e-10f  0.000000000015
        System.out.println("numero flotante = " + realFloat);

        System.out.println("logitud de un numero flotante = " + Float.BYTES);
        System.out.println("float correspondiente en bites a = " +Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float = " + Float.MIN_VALUE);

        double realDoble = 3.4028235E38;
        System.out.println("realDouble = " + realDoble);

        System.out.println("logitud de un numero doble = " + Double.BYTES);
        System.out.println("doble correspondiente en bites a = " + Double.SIZE);
        System.out.println("maximo valor para doble = " + Double.MAX_VALUE);
        System.out.println("minimo valor para doble = " + Double.MIN_VALUE);


    }
}
