package academy.devdojo.maratonajava;

public class Aula07EstruturasDeRepeticaoBreak {
    public static void main(String[] args) {
        double valorDoCarro = 92323.32;
        for (int parcela = 1; 1 <= valorDoCarro; parcela++){
              double valorParcela = valorDoCarro / parcela;
              if (valorParcela >= 1000){
                  System.out.println("parcela "+parcela+" R$"+valorParcela);
              }else {
                  break;
              }
        }
    }
}
