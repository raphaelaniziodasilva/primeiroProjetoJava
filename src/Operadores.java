public class Operadores {
    public static void main(String[] args) {
        // Operadores de atribuição
        int valor1 =  5;  //Atribui o valor 5 à variável valor
        int valor2 =  10;
        valor2 += 15;  //Equivalente a valor = valor + 15, atribui o valor 15 à variável valor
        System.out.println(valor2);

//        Operadores aritméticos: Os operadores aritméticos são usados para realizar operações matemáticas básicas. São eles:
//        "+" (adição) | "-" (subtração) | "*" | (multiplicação) "/" (divisão) | "%" (resto da divisão)
        int a = 10 + 5; // Atribui o valor 15 à variável a
        int b = 10 - 5; // Atribui o valor 5 à variável b
        int c = 10 * 5; // Atribui o valor 50 à variável c
        int d = 10 / 5; // Atribui o valor 2 à variável d
        int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)

//        Os operadores relacionais são usados para comparar valores. Eles retornam um valor booleano (verdadeiro ou falso)."==" (igual a)
//        "!=" (diferente de) | ">" (maior que) | ">=" (maior ou igual a) | "<" (menor que) | "<=" (menor ou igual a)
        int f = 10; // Atribui o valor 10 à variável a
        int g = 5; // Atribui o valor 5 à variável b
        int h = 30; // Atribui o valor 30 à variável c

        boolean igual = (f == g); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (g != h); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (g > f); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
        boolean menorIgual = (g <= h); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

//        Operadores lógicos:
//        Esses operadores são usados quando queremos verificar duas ou mais condições e/ou expressões na aplicação.
//        Eles fazem a comparação de valores booleanos e retornam também um resultado booleano.
//        São três operadores: AND (&&), OR (||) e NOT (!).
        boolean aa = true;
        boolean bb = false;
        if (aa && bb) {
            // Este código não será executado, já que a é verdadeiro e b é falso.
        }

        boolean ae = true;
        boolean be = false;
        if (ae || be) {
            // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
        }

        boolean ar = true;
        if (!ar) {
            // Este código não será executado, já que a é verdadeiro.
        }

//        Operadores de incremento:
//        operador de incremento é usado para aumentar o valor de uma variável em 1. Existem dois tipos de operadores de incremento:
//        o operador de pré-incremento (++variavel) e o operador de pós-incremento (variavel++).
//        O operador de pré-incremento (++variavel) aumenta o valor da variável em 1 antes de usar a variável em uma expressão. Aqui está um exemplo:
        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

//        Já o operador de pós-incremento (variavel++) aumenta o valor da variável em 1 depois de usar a variável em uma expressão. Aqui está um exemplo:
        int numero = 5;
        int resul = num++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(numero); // imprime 6
        System.out.println(resul); // imprime 5

    }
}