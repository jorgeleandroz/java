public class salariao {
    public static void main(String[] args) {
        float salario = 4500;
        float porcentagem = 30l;
        float porcentagemA = 10l;
        double porcentagemBB = salario * (porcentagem/100);
        double porcentagemBc = salario * (porcentagemA/100);
        if (salario > 4500){
            System.out.println(porcentagemBB);
        }else{
            System.out.println(porcentagemBc);
        }
    }
}
