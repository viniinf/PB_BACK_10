package br.edu.infnet.pb_back.model;

public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Double valorUnitario;
    private String fabricante;
    private String categoria;
    private Integer quantidadeEstoque;

    // Construtores
    public Produto() {
        // Construtor padrão
    }

    public Produto(Long id, String nome, String descricao, Double valorUnitario,
                   String fabricante, String categoria, Integer quantidadeEstoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Getters e setters
    // ...

    // Outros métodos, se necessário
}
