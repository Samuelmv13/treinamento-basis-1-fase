package com.basis.campina.xtarefas.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

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
    private String status;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_anexo")
    private List<Anexo> anexos;

    @Column(name = "data_nascimento")
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Responsavel.class)
    private Responsavel responsavel;
}
