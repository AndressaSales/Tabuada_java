import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner tela12 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = tela12.nextInt();

        System.out.println("A tabuada de " + num + " :");
        
        for(int i = 1; i <= 10; i++){
            int soma = num * i;
            System.out.println(num + " X " + i + " = " + soma);
        }
    }
}
