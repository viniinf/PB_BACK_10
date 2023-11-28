package br.edu.infnet.pb_back.service;

import br.edu.infnet.pb_back.model.Equipamento;
import br.edu.infnet.pb_back.model.Transacao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class EquipamentoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(EquipamentoService.class);
    private final Map<Long, Equipamento> equipamentoMap;

    public EquipamentoService(Map<Long, Equipamento> equipamentoMap) {
        this.equipamentoMap = equipamentoMap;
    }

    public Equipamento cadastrarEquipamento(Equipamento equipamento) {
        LOGGER.info("Cadastrando equipamento: {}", equipamento.getNome());
        // Implemente a lógica de cadastro de equipamento aqui
        equipamentoMap.put(equipamento.getId(), equipamento);
        return equipamento;
    }

    public void registrarTransacao(Equipamento equipamento, Transacao transacao) {
        // Implemente a lógica de registro de transação aqui
    }

    // Outros métodos de serviço conforme necessário
}
