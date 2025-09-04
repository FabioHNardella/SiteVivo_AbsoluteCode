package br.com.absolutecode.abscode.model;

import jakarta.persistence.*;


@Entity
public class Buddy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BUDDY")
    private int id;

    @Column(name = "NOME_BUDDY", nullable = false)
    private String nome;

    @Column(name = "SOBRENOME_BUDDY", nullable = false)
    private String sobrenome;

    @Column(name = "EMAIL_BUDDY", nullable = false)
    private String email;

    @Column(name = "TELEFONE_BUDDY", nullable = false)
    private String telefone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SETOR", nullable = false)
    private Setor setor;

    @OneToOne
    @JoinColumn(name = "ID_NOVO_COLABORADOR", nullable = false)
    private NovoColaborador novoColaborador;

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

    public NovoColaborador getNovoColaborador() {
        return novoColaborador;
    }
}
