import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) throws Exception {
        double altura, peso;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Qual é a sua altura?");
            altura = teclado.nextDouble();
        }
        peso = (72.7*altura) - 58;
        System.out.println(" Seu peso ideal é " + peso);
    }
}