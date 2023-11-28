package br.edu.infnet.pb_back.model;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Long id;
    private LocalDateTime data;
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Double valorTotal;
    private String formaPagamento;
    private String status;

    // Construtores
    public Pedido() {
        // Construtor padrão
    }

    public Pedido(Long id, LocalDateTime data, Cliente cliente, List<ItemPedido> itens,
                  Double valorTotal, String formaPagamento, String status) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    // Getters e setters
    // ...

    // Outros métodos, se necessário
}
