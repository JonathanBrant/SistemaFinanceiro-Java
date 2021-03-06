package br.com.minhaempresa.domain;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaConjunta extends Conta {

    private List<Cliente> outrosTitulares = new ArrayList<>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

    public List<Cliente> getOutrosTitulares() {
        return outrosTitulares;
    }

    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
        this.outrosTitulares = outrosTitulares;
    }
}
