package br.edu.infnet.pb_back.service;

import br.edu.infnet.pb_back.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClienteService {
    private final Map<Long, Cliente> clientes = new HashMap<>();
    private long idCounter = 1;

    public Cliente incluirCliente(Cliente cliente) {
        cliente.setId(idCounter++);
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    public List<Cliente> obterListaClientes() {
        return List.copyOf(clientes.values());
    }

    // Outros métodos de serviço conforme necessário
}
