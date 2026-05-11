public class ProgramaConta {
    public static void main(String[] args){
        Conta conta1 = new Conta();
        
        conta1.setNumero(1234);
        conta1.setTitular("João");
        
        conta1.depositar(1000);

        conta1.sacar(300);

        System.out.println("Número: " + conta1.getNumero());
        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Saldo: R$ " + conta1.getSaldo());
    }
}