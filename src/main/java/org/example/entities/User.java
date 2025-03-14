package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "NOME", nullable = false)
    private String name;

    @Column(name = "IDADE", nullable = false)
    private Integer idade;

    //Construtor Vazio

    public User() {
    }

    public User(Long id, String name, Integer idade) {
        this.id = id;
        this.name = name;
        this.idade = idade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
