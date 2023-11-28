package br.edu.infnet.pb_back.model;

public class ItemPedido {
    private Long id;
    private Pedido pedido;
    private Produto produto;
    private Integer quantidade;
    private Double valorUnitario;
    private String observacao;

    // Construtores
    public ItemPedido() {
        // Construtor padrão
    }

    public ItemPedido(Long id, Pedido pedido, Produto produto, Integer quantidade,
                      Double valorUnitario, String observacao) {
        this.id = id;
        this.pedido = pedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.observacao = observacao;
    }

    // Getters e setters
    // ...

    // Outros métodos, se necessário
}
