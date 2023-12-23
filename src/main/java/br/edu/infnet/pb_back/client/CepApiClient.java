package br.edu.infnet.pb_back.client;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CepApiClient {

    private final String VIA_CEP_URL = "https://viacep.com.br/ws/";

    private final RestTemplate restTemplate;

    public CepApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String obterEnderecoPorCep(String cep) {
        String url = VIA_CEP_URL + cep + "/json";
        return restTemplate.getForObject(url, String.class);
    }
}
