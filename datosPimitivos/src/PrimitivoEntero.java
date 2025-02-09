public class PrimitivoEntero {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numero byte = " + numeroByte);
        System.out.println("longitud del numero byte = " + Byte.BYTES);
        System.out.println("tamaño en memoria de byte = " + Byte.SIZE);
        System.out.println("Valor maximo para byte = " + Byte.MAX_VALUE);
        System.out.println("Valor minimo para byte = " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numero short = " + numeroShort);
        System.out.println("longitud del numero short = " + Short.BYTES);
        System.out.println("tamaño en memoria de short = " + Short.SIZE);
        System.out.println("Valor maximo para short = " + Short.MAX_VALUE);
        System.out.println("Valor minimo para short = " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numero int = " + numeroInt);
        System.out.println("longitud del numero int = " + Integer.BYTES);
        System.out.println("tamaño en memoria de int = " + Integer.SIZE);
        System.out.println("Valor maximo para int = " + Integer.MAX_VALUE);
        System.out.println("Valor minimo para int = " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numero long = " + numeroLong);
        System.out.println("longitud del numero long = " + Long.BYTES);
        System.out.println("tamaño en memoria de long = " + Long.SIZE);
        System.out.println("Valor maximo para long = " + Long.MAX_VALUE);
        System.out.println("Valor minimo para long = " + Long.MIN_VALUE);

        var numeroVar = 127L;
        System.out.println("numero var = " + numeroVar);
        //var es un caso especial, es para guardar cadena de caracter, pero puede usarse tambien para guardar numeros, si se hace algunos pasos


    }
}