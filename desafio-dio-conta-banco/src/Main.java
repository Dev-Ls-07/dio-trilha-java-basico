public class Main {
    public static void main(String[] args) {
        conta cc = new contaCorrente();
        conta Poupança = new contaPoupança();

        cc.imprimirExtrato();
        Poupança.imprimirExtrato();
    }
}
