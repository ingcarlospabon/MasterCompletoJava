public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programacion en Java";
        String curso2 = new String("Programacion en Java");

        boolean esIgual = curso == curso2;
        System.out.println("es igual = " + esIgual);

        esIgual = curso.equals(curso2);
        System.out.println("es igual = " + esIgual);

        String curso3 = "Programacion en Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);
    }
}
