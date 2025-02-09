public class holaMundo {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

       //ejemplo variables
        String saludar = "hola mundo desde java";
        System.out.println(saludar);
        System.out.println(saludar.toUpperCase());

        int numero =10;
        boolean valor = true;

        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero2 = " + numero2);

        var numero3 = "15";
        String nombre;

        nombre ="Carlos";

        if (numero >10){
            nombre = "Javier";
        }
        System.out.println("nombre = " + nombre);
    }
}
