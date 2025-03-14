package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(length = 55, name = "NOME", nullable = false)
    private String name;

    @Column(length = 25, name = "CPFCNPJ", nullable = false)
    private String cpfCnpj;

    @Column(name = "DATANASCIMENTO", nullable = false)
    private LocalDate dataNasc;

    @Column(length = 25, name = "PAGAMENTO", nullable = false)
    private String formaPag;

    public Client() {
    }

    public Client(Long id, String name, String cpfCnpj, LocalDate dataNasc, String formaPag) {
        this.id = id;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.dataNasc = dataNasc;
        this.formaPag = formaPag;
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

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getFormaPag() {
        return formaPag;
    }

    public void setFormaPag(String formaPag) {
        this.formaPag = formaPag;
    }
}
