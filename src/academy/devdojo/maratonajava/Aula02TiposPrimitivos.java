package academy.devdojo.maratonajava;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
         /*
        Tipos de dados primitivos:
        byte - 8 bits - valores de -128 a 127 - 1 byte
        short - 16 bits - valores de -32.768 a 32767 - 2 bytes
        int - 32 bits - valores de -2^32 a 2^32 - 1 - 4 bytes
        long - 64 bits - valores de -2^63 a 2^63 - 1 - requer sufixo L - 8 bytes
        float - 32 bits - precisão simples - requer sufixo f - 4 bytes
        double - 64 bits - precisão dupla - padrão para números decimais - 8 bytes
        char - 16 bits - armazena 1 caractere - 2 bytes
        boolean - 1 bit - guarda false or true - 1 bit
         */

        int ageInt = 10;
        long bigNumber =1000000;
        char letter = 'M';
        byte ageByte = 10;
        short ageShort = 10;
        double salaryDouble = 2500.0D;
        float salaryFloat = 2500.0F;
        boolean truth = true;
        boolean fake = false;

        System.out.println("age is "+ageInt+ " years");
        System.out.println(fake);
        System.out.println("char: "+letter);

        //casting
        float casting = (float) 2000.0D;
        System.out.println("double from float: "+casting);

        //String no java é uma classe
        String nome = "Otávio";
        System.out.println("oi meu nome é "+nome);
    }

}
