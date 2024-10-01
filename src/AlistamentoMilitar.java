import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 18;

        if( (sexo == 'M' || sexo == 'F') && idade < 18){
            System.out.println("alistamento nao permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("alistamento obrigatorio");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("deseja se alistar ");
        }
    }
}
