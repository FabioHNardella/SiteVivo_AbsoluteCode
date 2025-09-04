package br.com.absolutecode.abscode.model;

import jakarta.persistence.*;

@Entity
public class Gestor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_GESTOR", nullable = false)
    private int id;

    @Column(name = "NOME_GESTOR", nullable = false)
    private String nome;

    @Column(name = "SOBRENOME_GESTOR", nullable = false)
    private String sobrenome;

    @Column(name = "EMAIL_GESTOR", nullable = false)
    private String email;

    @Column(name = "TELEFONE_GESTOR", nullable = false)
    private String telefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SETOR", nullable = false)
    private Setor setor;

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

    public Setor getSetor() {
        return setor;
    }
}
