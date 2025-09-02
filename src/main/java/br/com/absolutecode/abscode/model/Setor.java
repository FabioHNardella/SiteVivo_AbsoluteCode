package br.com.absolutecode.abscode.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Setor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SETOR")
    private int id;

    @Column(name = "NOME_SETOR")
    private String nome;

    @OneToMany(mappedBy = "setor")  // Mapeando a propriedade user da classe Order
    private List<Gestor> gestores;

    @OneToMany(mappedBy = "setor")  // Mapeando a propriedade user da classe Order
    private List<Buddy> buddies;
}
