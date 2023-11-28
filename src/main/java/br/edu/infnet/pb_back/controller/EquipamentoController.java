package br.edu.infnet.pb_back.controller;

import br.edu.infnet.pb_back.model.Equipamento;
import br.edu.infnet.pb_back.service.EquipamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/equipamentos")
public class EquipamentoController {
    private final EquipamentoService equipamentoService;

    @Autowired
    public EquipamentoController(EquipamentoService equipamentoService) {
        this.equipamentoService = equipamentoService;
    }

    @PostMapping
    public ResponseEntity<Equipamento> cadastrarEquipamento(@Valid @RequestBody Equipamento equipamento) {
        if (equipamento.getNome() == null || equipamento.getModelo() == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        Equipamento novoEquipamento = equipamentoService.cadastrarEquipamento(equipamento);
        return new ResponseEntity<>(novoEquipamento, HttpStatus.CREATED);
    }

}