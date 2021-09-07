public class SistemaFinanceiro {


    public static void main(String[] args) {
        Cliente destinatario = new Cliente();
        destinatario.setNome("Jonathan");
        destinatario.setSobrenome("Brant");
        Conta contaDestino = new ContaCorrente(destinatario);

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.autenticar("2");
        caixa.efetuarDeposito(1000);
        caixa.efetuarSaque(200);
        caixa.exibirSaldo();
        caixa.encerrar();
        caixa.efetuarTransferencia(contaDestino, 40);
        caixa.exibirSaldo();

    }

}