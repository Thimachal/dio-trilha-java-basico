import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numberCount;
        String agency;
        String name;
        Double balanceCount;

        System.out.println("Por favor, digite o número da Agência !");
        agency = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        numberCount = scanner.nextInt();
        System.out.println("Por favor, digite o seu nome !");
        name = scanner.next();
        System.out.println("Por favor, digite o seu saldo !");
        balanceCount = scanner.nextDouble();
        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency +
                ", conta " + numberCount + " e seu saldo " + balanceCount + " já está disponível para saque");

                scanner.close();

    }
}