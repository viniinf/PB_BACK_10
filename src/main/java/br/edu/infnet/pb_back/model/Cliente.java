package br.edu.infnet.pb_back.model;

import java.time.LocalDate;

/**
 * Representa um cliente no sistema.
 */
public class Cliente {
    private Long id;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private String endereco;
    private String telefone;
    private String cpf;

    // Construtores

    public Cliente() {
        // Construtor padrão
    }

    public Cliente(Long id, String nome, String email, LocalDate dataNascimento,
                   String endereco, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public void setId(long l) {
    }

    public Long getId() {
        return null;
    }

    // Getters e setters
    // ...

    // Outros métodos, se necessário
}
