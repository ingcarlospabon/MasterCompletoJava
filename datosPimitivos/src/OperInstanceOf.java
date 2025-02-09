public class OperInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto dela clase string ... que tal?";
        Integer num = 7;
        boolean b1 = texto instanceof String;
        System.out.println("texto de tipo string = " + b1);
        b1 = texto instanceof Object;
        System.out.println("texto de tipo objetc: " + b1);
        b1 = num instanceof Integer;
        System.out.println("num de tipo Integer: " + b1);
        b1 = num instanceof Number;
        System.out.println("num de tipo Number: " + b1);
        b1 = num instanceof Object;
        System.out.println("num de tipo Object: " + b1);
        Double decimal = 45.54;
        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Numbre: " + b1);
        //b1 = b1 instanceof Boolean;
        System.out.println("b1 es el tipo boolean: " + b1);
    }
}
