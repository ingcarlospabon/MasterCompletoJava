public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Javier";

        System.out.println("longitud nombre: " + nombre.length());
        System.out.println("nombre mayuscula: " + nombre.toUpperCase());
        System.out.println("nombre minuscula: " + nombre.toLowerCase());
        System.out.println("nombre igual carlos: " + nombre.equals("Carlos"));
        System.out.println("nombre igual javier: " + nombre.equals("javier"));
        System.out.println("nombre igual: " + nombre.equalsIgnoreCase("javier"));
        System.out.println("nombre compare javier: " + nombre.compareTo("Javier"));
        System.out.println("nombre compare carlos: " + nombre.compareTo("Carlos"));
        System.out.println("Nombre: " + nombre.charAt(0));
        System.out.println("Nombre: " + nombre.charAt(1));
        System.out.println("Nombre: " + nombre.charAt(nombre.length()-1));
        System.out.println("Parte del nombre: " + nombre.substring(1));
        System.out.println("Parte del nombre: " + nombre.substring(1,4));
        System.out.println("Parte del nombre: " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a", ","));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a')); //ubica la primera coindcidencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.startsWith(\"tr\") = " + trabalenguas.startsWith("tr"));
        System.out.println("trabalenguas.endsWith(\"s\") = " + trabalenguas.endsWith("s"));

    }

}
