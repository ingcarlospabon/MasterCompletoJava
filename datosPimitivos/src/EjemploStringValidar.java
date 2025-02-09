public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso= null;

        boolean esNulo = curso == null;

        System.out.println("es nulo = " + esNulo);

        if(esNulo){
            curso = "Programación en Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("es vacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println(" es vacio 2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("es blanco: " + esBlanco);

        if(!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }

        if(esBlanco == false){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }

    }
}
