package academy.devdojo.maratonajava;

public class Aula04EstruturasCondicionais {
    public static void main(String[] args) {
        double salario = 78888;
        double salarioComImposto;
        double taxaDeImposto;
        if (salario <= 34712){
            taxaDeImposto = 9.70;
        } else if (salario <= 68587){
            taxaDeImposto = 37.35;
        } else {
            taxaDeImposto = 49.50;
        }
        salarioComImposto = salario * (taxaDeImposto/100+1);
        System.out.println("seu salário com o imposto de "+taxaDeImposto+"%"+" aplicado é de " + salarioComImposto+"R$");
    }
}
