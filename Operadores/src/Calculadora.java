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

        System.out.println("Aaa: " + op.adicao(n1, n2));

        s.close();
    }
}
