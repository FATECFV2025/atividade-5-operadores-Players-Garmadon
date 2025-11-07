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

        op.v1 = n1;
        op.v2 = n2;

        System.out.println( "Selecione uma operação dentre essas:\n\nOPERADORES LÓGICOS:\r\n" + //
                            "1) Soma\r\n" + //
                            "2) Subtração\r\n" + //
                            "3) Multiplicação\r\n" + //
                            "4) Divisão\r\n" + //
                            "5) Módulo (resto da divisão)\r\n" + //
                            "\nOPERADORES ARITMÉTICOS:\r\n" + //
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

        switch (operador)
        {
            case 1:
                String texto = MessageFormat.format("{0} + {1} = {2}", n1, n2, op.adicao(n1, n2));
                System.out.println(texto);
            default:
                System.out.println("Pipipi Pópópó");
                break;
        }
            
        String texto = MessageFormat.format("{0} + {1} = {2}", n1, n2, op.adicao(n1, n2));
        System.out.println(texto);

        s.close();
    }
}
