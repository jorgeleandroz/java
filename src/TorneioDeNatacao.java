import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu idade: ");
        String nome = input.next();
        System.out.println("Digite o seu idade: ");
        int idade = input.nextInt();
        String nome2 = null;
        nome = "";
        if (nome2 == null || nome2 == ""){

        }
        if (idade <= 10){
            System.out.println(nome + " Participara da categoria infantil");
        } else if (idade >= 11 && idade <= 15 ) {
            System.out.println(nome + " participara da categoria juvenil");
        } else if (idade >= 16 && idade <=19) {
            System.out.println(nome + " participara da categoria pre-adulto");
        }else {
            System.out.println(nome + " participara da categoria adulto ");
        }
    }
}
