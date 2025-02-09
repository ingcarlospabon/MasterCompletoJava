public class Primitivocaracteres {
    public static void main(String[] args) {
        char caracter = 'a';
        System.out.println("caracter = " + caracter);

        var caracter2 = '\u0040';
        char decimal = 64;
        System.out.println("caracter = " + caracter2);
        System.out.println("decimal = " +  decimal);
        System.out.println("decimal = caracter: " + (decimal == caracter2));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter2));

        System.out.println("char de un numero doble = " + Character.BYTES);
        System.out.println("char correspondiente en bites a = " + Character.SIZE);
        System.out.println("maximo valor para char = " + Character.MAX_VALUE);
        System.out.println("minimo valor para char = " + Character.MIN_VALUE);
    }
}
