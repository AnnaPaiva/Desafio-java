import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

   
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite seu Numero de Conta");
        String numero = scanner.next();

        System.out.println("Digite seu saldo");
        String saldo = scanner.next();

    

        
        System.out.println("Olá, Mario Andrade  obrigado por criar uma conta em nosso banco");
        System.out.println("sua agência é 067-8, conta 1021 ");
        System.out.println("e seu saldo 237.48 já está disponível para saque");
       
    
    }


}