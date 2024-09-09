//2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
// além de informar a quantidade de vezes em que ela ocorre.

public class Exercicio2 {
    public static void main(String[] args) {

        String s = "aAbcdefAA";


        int qtd = 0;
        for(char c: s.toLowerCase().toCharArray()){
            if(c == 'a')
                qtd++;
        }
        System.out.println("String [" + s + "] -- qtd de A/a: " + qtd);
    }
}
