public class EjemploStringMetodoArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.length() " + trabalenguas.length());
        System.out.println("trabalenguas: " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for(int i =0; i < largo; i++){
            System.out.println("arrglo = " + arreglo[i]);
        }
        System.out.println();
        System.out.println("\ntrabalenguas= " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
    }
}
