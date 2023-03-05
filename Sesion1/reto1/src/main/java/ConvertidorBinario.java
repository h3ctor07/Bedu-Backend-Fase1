import java.util.Scanner;

public class ConvertidorBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa numero");
        int numero = Integer.valueOf(scanner.nextLine());
        String binario = Integer.toBinaryString(numero);
        System.out.println("Binario: " + binario);

    }
}