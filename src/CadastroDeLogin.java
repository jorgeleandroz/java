import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if(nome.equals("") || nome.equalsIgnoreCase("adimin") || nome.equalsIgnoreCase("administrador") ){
            System.out.println("Usuario invalido");
        }else {
            System.out.println(nome + " cadastrado com sucesso");
        }
    }
}