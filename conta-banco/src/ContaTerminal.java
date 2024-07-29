import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = scanner.next();
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite o seu saldo:");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
                            + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechar o scanner
        scanner.close();
    }
}