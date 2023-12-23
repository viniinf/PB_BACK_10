package br.edu.infnet.pb_back.service;

import br.edu.infnet.pb_back.model.Endereco;
import org.springframework.web.client.RestTemplate;

public class CepApiClient {
    private final String apiUrl = "https://viacep.com.br/ws/";

    private final RestTemplate restTemplate;

    public CepApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Endereco consultarCep(String cep) {
        String url = apiUrl + cep + "/json";
        return restTemplate.getForObject(url, Endereco.class);
    }
}
