package br.edu.infnet.pb_back.service;

import br.edu.infnet.pb_back.model.Endereco;
import org.springframework.stereotype.Service;

@Service
public class MeuServico {

    private final CepApiClient cepApiClient;

    public MeuServico(CepApiClient cepApiClient) {
        this.cepApiClient = cepApiClient;
    }

    public Endereco obterEnderecoPorCep(String cep) {
        return cepApiClient.consultarCep(cep);
    }
}
