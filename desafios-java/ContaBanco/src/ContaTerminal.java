import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
   
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble(); 
        
        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.next();
        
        String mensagem = "Olá ".concat(nomeCliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia)
            .concat(", conta ")
            .concat(String.valueOf(numeroConta))
            .concat(" e seu saldo ")
            .concat(String.valueOf(saldo))
            .concat(" já esta disponível para saque.");

        System.out.println(mensagem);
        
    }
}