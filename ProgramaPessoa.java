public class ProgramaPessoa {
    public static void main(String[] args){
        PessoaFisica pf = new PessoaFisica();

        pf.setNome("Carlos Victor");
        pf.setDataNasc("10/05/1998");
        pf.setCpf("123.456.789-00");
        pf.setSexo('M');

        System.out.println("=== Pessoa Física ===");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Data de Nascimento: " + pf.getDataNasc());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Sexo: " + pf.getSexo());

        System.out.println();

        PessoaJuridica pj = new PessoaJuridica();

        pj.setNome("Empresa Tech");
        pj.setDataNasc("01/01/2015");
        pj.setCnpj("12.345.678/0001-99");

        System.out.println("=== Pessoa Jurídica ===");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Data da Fundação: " + pj.getDataNasc());
        System.out.println("CNPJ: " + pj.getCnpj());
    }
}