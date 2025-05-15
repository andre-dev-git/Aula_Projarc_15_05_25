package br.pucrs.nomeusuario.exemplo.persistencia;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "codigo")
public class Autor {
    @Id
    private long codigo;
    private String nome;
    private int ano_nascimento;
    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL)
    private List<Livro> livros;

    protected Autor() {
    }

    public Autor(long codigo, String nome, int ano_nascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano_nascimento = ano_nascimento;
    }

}
