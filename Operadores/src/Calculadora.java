import java.text.MessageFormat;
import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        Operadores op = new Operadores();

        System.out.print("Digite um número: ");
        float n1 = s.nextFloat();
        System.out.print("Digite um outro número: ");
        float n2 = s.nextFloat();

        System.out.println( "Selecione uma operação dentre essas:\n\nOPERADORES ARITMÉTICOS:\r\n" + //
                            "1) Soma\r\n" + //
                            "2) Subtração\r\n" + //
                            "3) Multiplicação\r\n" + //
                            "4) Divisão\r\n" + //
                            "5) Módulo (resto da divisão)\r\n" + //
                            "\nOPERADORES DE ATRIBUIÇÃO:\r\n" + //
                            "6) Atribuição de adição (+=)\r\n" + //
                            "7) Atribuição de subtração (-=)\r\n" + //
                            "8) Atribuição de multiplicação (*=)\r\n" + //
                            "9) Atribuição de divisão (/=)\r\n" + //
                            "10) Atribuição simples (=)\r\n" + //
                            "\nOPERADORES DE COMPARAÇÃO:\r\n" + //
                            "11) Igual a\r\n" + //
                            "12) Diferente de\r\n" + //
                            "13) Menor que\r\n" + //
                            "14) Maior que\r\n" + //
                            "15) Menor ou igual a\r\n" + //
                            "16) Menor ou igual a\r\n" + //
                            "\nSua escolha: ");
        int operador = s.nextInt();

        op.v1 = n1;
        op.v2 = n2;

        switch (operador)
        {
            // Operadores Aritméticos
            case 1:
                String texto1 = MessageFormat.format("{0} + {1} = {2}", n1, n2, op.adicao(n1, n2));
                System.out.println(texto1);
                break;
            case 2:
                String texto2 = MessageFormat.format("{0} - {1} = {2}", n1, n2, op.subtracao(n1, n2));
                System.out.println(texto2);
                break;
            case 3:
                String texto3 = MessageFormat.format("{0} * {1} = {2}", n1, n2, op.multiplicacao(n1, n2));
                System.out.println(texto3);
                break;
            case 4:
                String texto4 = MessageFormat.format("{0} / {1} = {2}", n1, n2, op.divisao(n1, n2));
                System.out.println(texto4);
                break;
            case 5:
                String texto5 = MessageFormat.format("{0} mod {1} = {2}", n1, n2, op.modulo(n1, n2));
                System.out.println(texto5);
                break;
            // Operadores de Atribuição
            case 6:
                String texto6 = MessageFormat.format("X += Y:\nX = {0} + {1} = {2}\nX = {2}", n1, n2, op.atrbAdicao(n1, n2));
                System.out.println(texto6);
                break;
            case 7:
                String texto7 = MessageFormat.format("X += Y:\nX = {0} - {1} = {2}\nX = {2}", n1, n2, op.atrbSubtracao(n1, n2));
                System.out.println(texto7);
                break;
            case 8:
                String texto8 = MessageFormat.format("X *= Y:\nX = {0} * {1} = {2}\nX = {2}", n1, n2, op.atrbMultiplicacao(n1, n2));
                System.out.println(texto8);
                break;
            case 9:
                String texto9 = MessageFormat.format("X /= Y:\nX = {0} / {1} = {2}\nX = {2}", n1, n2, op.atrbDivisao(n1, n2));
                System.out.println(texto9);
                break;
            case 10:
                String texto10 = MessageFormat.format("O seu primeiro número agora é igual ao segundo:\n(2º) {0} = (1º) {1}", n2, op.atrbSimples(n1, n2));
                System.out.println(texto10);
                break;
            // Operadores Comparação
            case 11:
                String texto11 = MessageFormat.format("{0} é igual a {1}? {2}", n1, n2, op.igual(n1, n2));
                System.out.println(texto11);
                break;
            case 12:
                String texto12 = MessageFormat.format("{0} é diferente de {1}? {2}", n1, n2, op.diferente(n1, n2));
                System.out.println(texto12);
                break;
            case 13:
                String texto13 = MessageFormat.format("{0} é menor que {1}? {2}", n1, n2, op.menor(n1, n2));
                System.out.println(texto13);
                break;
            case 14:
                String texto14 = MessageFormat.format("{0} é maior que {1}? {2}", n1, n2, op.maior(n1, n2));
                System.out.println(texto14);
                break;
            case 15:
                String texto15 = MessageFormat.format("{0} é menor ou igual a {1}? {2}", n1, n2, op.menorIgual(n1, n2));
                System.out.println(texto15);
                break;
            case 16:
                String texto16 = MessageFormat.format("{0} é maior ou igual a {1}? {2}", n1, n2, op.maiorIgual(n1, n2));
                System.out.println(texto16);
                break;
            default:
                System.out.println("Verifique se o número escolhido está entre as opções");
                break;
        }

        s.close();
    }
}
