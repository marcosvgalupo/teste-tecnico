//1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1
//e o próximo valor sempre será a soma dos 2 valores anteriores
//(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
//escreva um programa na linguagem que desejar onde, informado um número,
//ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o
//número informado pertence ou não a sequência.


public class Exercicio1{
    public static void main(String[] args) {
        int number = 8; // numero de exemplo;

        int n1 = 0;
        int n2 = 1;

        while (n2 <= number) {
            if(n2 == number){
                System.exit(1); // pertence à sequencia
            }

            int prox = n1 + n2;
            n1 = n2;
            n2 = prox;
        }
        System.exit(0); //nao pertence
    }

}