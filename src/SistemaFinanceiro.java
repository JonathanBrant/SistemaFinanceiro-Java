public class SistemaFinanceiro {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Jonathan");
        cliente.setSobrenome("de Tal");

        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        Conta novaContaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        Conta novaContaPoupanca = new ContaPoupanca(cliente);
        CaixaEletronico caixa = new CaixaEletronico();
        ContaEspecial contaEspecial = new ContaEspecial(cliente);


        caixa.consultarSaldo(contaCorrente);
        caixa.consultarSaldo(contaPoupanca);

        contaCorrente.depositar(1000);
        caixa.consultarSaldo(contaCorrente);
        contaCorrente.sacar(200);
        caixa.consultarSaldo(contaCorrente);

        contaPoupanca.depositar(2000);
        caixa.consultarSaldo(contaPoupanca);
        contaPoupanca.sacar(400);
        caixa.consultarSaldo(contaPoupanca);

        contaEspecial.depositar(5000);
        caixa.consultarSaldo(contaEspecial);
        contaEspecial.sacar(0);
        caixa.consultarSaldo(contaEspecial);
    }
}
