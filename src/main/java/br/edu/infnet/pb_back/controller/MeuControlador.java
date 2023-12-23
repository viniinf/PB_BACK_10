package br.edu.infnet.pb_back.controller;

import br.edu.infnet.pb_back.model.Endereco;
import br.edu.infnet.pb_back.service.MeuServico;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/enderecos")
public class MeuControlador {

    private final MeuServico meuServico;

    public MeuControlador(MeuServico meuServico) {
        this.meuServico = meuServico;
    }

    @GetMapping("/{cep}")
    public Endereco obterEnderecoPorCep(@PathVariable String cep) {
        return meuServico.obterEnderecoPorCep(cep);
    }
}
