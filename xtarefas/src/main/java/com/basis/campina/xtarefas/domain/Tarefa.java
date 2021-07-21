package com.basis.campina.xtarefas.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "TB_TAREFA")
@Getter
@Setter
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarefa")
    @SequenceGenerator(name = "seq_tarefa", allocationSize = 1, sequenceName = "seq_tarefa", initialValue = 1)
    @Column(name = "id_tarefa")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private LocalDate dataConclusao;

    @Column(name = "data_nascimento")
    private LocalDate dataInicio;

    @Column(name = "data_nascimento")
    private LocalDate status;

    @Column(name = "data_nascimento")
    private LocalDate anexo;

    @Column(name = "data_nascimento")
    private LocalDate responsavel;
}
id, nome, dataConclusao, dataInicio, status, anexo, responsavel;