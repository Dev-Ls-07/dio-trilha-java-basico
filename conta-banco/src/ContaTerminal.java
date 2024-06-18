import java.util.Scanner;

/*para fazer a conta banco sera necessario:
*um tipo int
*duas Strings
*um double
*/
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
/*todo: exibir a classe Scanner.
 * exibir as mensagens para o nosso usuario.
 * obter pela scanner os valores digitados no terminal.
 * exibir a mensagem conta criada.
 */
    Scanner texto1 = new Scanner(System.in);

        double saldo = 1.575;

    System.out.println("Por favor. insire o nome da Agência:");
        String agencia = texto1.nextLine();

    Scanner texto2 = new Scanner(System.in);

    System.out.println("Por favor, digite o numero da Agência:");
        int numero = texto2.nextInt();

    Scanner texto3 = new Scanner(System.in);

    System.out.println("Por favor, digite o seu nome:");
        String nome = texto3.nextLine();

    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é a " + agencia + ", conta  " + numero +" e seu saldo de "+ saldo +" reais já está disponível para saque.");

texto1.close();
texto2.close();
texto3.close();
    }
}
