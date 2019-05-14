import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println("O quadrado de " + num + " é: " + getQuadrado(num));
        System.out.println("O cubo de " + num + " é: " + getCubo(num));
        System.out.println("A raiz quadrada de " + num + " é: " + getRaizQuadrada(num));
        System.out.println("O fatorial de " + num + " é: " + getFatorial(num));
        System.out.println("O " + num + "º número da sequência de Fibonacci é: " + getFibonacci(num));
        System.out.println("O antecessor de " + num + " é: " + getAntecessor(num));
        System.out.println("O sucessor de " + num + " é: " + getSucessor(num));

        if(ehPar(num)) {
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é ímpar");
        }
    }

    private static int getQuadrado(int num) {
        return num * num;
    }

    private static int getCubo(int num) {
        return num * num * num;
    }

    private static double getRaizQuadrada(int num) {
        return Math.sqrt(num);
    }

    private static int getFatorial(int num) {
        int fatorial = num;
        for (int i = num - 1; i > 1; i--) {
            fatorial *= i;
        }
        return fatorial;
    }

    private static int getFibonacci(int n){
        int i = 0;
        int j = 1;
        for(int k = 0; k < n; k++){
            i += j;
            j = i - j;
        }
        return j;
    }

    private static int getAntecessor(int num){
        return num - 1;
    }

    private static int getSucessor(int num){
        return num + 1;
    }

    private static boolean ehPar(int num) { return num % 2 == 0; }
}
