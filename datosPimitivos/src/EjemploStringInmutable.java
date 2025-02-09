public class EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programacion en Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(profesor);
        System.out.println("curso: " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
           return  c + " con " +profesor;
        });
        System.out.println("Curso = " + curso   );
        System.out.println("resultado 2 = " + resultado2);
        resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
    }
}
