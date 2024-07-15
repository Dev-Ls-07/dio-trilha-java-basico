public class contaPoupança extends conta {

    public void imprimirExtrato(){
        System.out.println("*** Extrato conta poupanca ***");
        super.imprimirInfosComuns();
    }
}
