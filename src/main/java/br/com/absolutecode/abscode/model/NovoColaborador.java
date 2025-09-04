package br.com.absolutecode.abscode.model;

import jakarta.persistence.*;

@Entity
public class NovoColaborador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NOVO_COLABORADOR")
    private int id;

    @Column(name = "NOME_NOVO_COLABORADOR", nullable = false)
    private String nome;

    @Column(name = "SOBRENOME_NOVO_COLABORADOR",nullable = false )
    private String sobrenome;

    @Column(name = "EMAIL_NOVO_COLABORADOR", nullable = false)
    private String email;

    @Column(name = "TELEFONE_NOVO_COLABORADOR", nullable = false)
    private String telefone;

    @OneToOne
    @JoinColumn(name = "ID_BUDDY", nullable = false)
    private Buddy buddy;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Buddy getBuddy() {
        return buddy;
    }
}
