public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        int count = nombres.length;

        for(int i = 0; i < count; i++){
            System.out.println(i + "nombres: " +nombres[i]);
        }
    }
}
