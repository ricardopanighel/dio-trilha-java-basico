package src;

public class Operadores {
    public static void main(String[] args) {
        /*Unários
        de valor positivo (+)
        de valor negativo (-)
        de incremento (++)
        de decremento (--)
        de negação (!)

        System.out.print(numero ++); - o valor não aparecerá maior, pois imprime e depois incrementa
        System.out.print(++ numero); - aparecerá o valor incrementador
        Mesma regra no decremento
         */
        int numero = 5;
        System.out.println(numero++);
        System.out.println(++numero);

        boolean variavel = true;
        variavel = ! variavel;

        System.out.println(variavel);
        /*Ternário

        Representado pelos símbolos ?:
        <Expressão Condicional> ? <Caso condição seja true> : <Caso condição seja false>
         */
        int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        /*Relacionais

        == (Verifica se variáveis são iguais)
        != (Verifica se são diferentes)
        > (Verifica se uma é maior que a outra)
        >= (Verifica se uma é maior ou igual a outra)
        < (Verifica se uma é menor que a outra)
        <= (Verifica se uma é menor ou igual a outra)
         */

        int numero1 = 4;
        int numero2 = 6;

        boolean simNao = numero1 == numero2;
        System.out.println("Número 1 é igual ao número 2: " + simNao);

        /* Há uma diferença ao comparar objetos*/
        String nomeUm = "RICARDO";
        String nomeDois = new String("RICARDO");
        System.out.println(nomeUm.equals(nomeDois));

        /*Lógicos

        && - Operador lógico "E"
        || - Operador lógico "OU"
         */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }

        if (condicao1 || condicao2){
            System.out.println("Alguma das condições é verdadeira.");
        }
    }
}
