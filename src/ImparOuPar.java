public class ImparOuPar {
    public static void main(String[] args) {
        // + - * / %
        int numero = 3;
        if (numero % 2 == 0){
            System.out.println("par: " +(numero % 2) );
        }else {
            System.out.println("impar: " + (numero % 2));
        }
    }
}