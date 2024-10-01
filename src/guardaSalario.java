//Exercicio feito de forma q ocupa muita memoria

public class guardaSalario {
    public static void main(String[] args){
        float salario = 5000;
        float porcentagem = 30L;
        float porcentagemA = 15L;
        float porcentagemB = 5L;
        double porcentagemResultado = salario *(porcentagem/100);
        double porcentagemResultadoA = salario *(porcentagemA/100);
        double porcentagemResultadoB = salario *(porcentagemB/100);
        System.out.println("30% de 5000 " + porcentagemResultado);
        System.out.println("15% de 5000 " + porcentagemResultadoA);
        System.out.println("5% de 5000 " + porcentagemResultadoB);
    }
}
