package com.basis.campina.xtarefas.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

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
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_TAREFA")
@Getter
@Setter
public class Tarefa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_tarefa")
    @SequenceGenerator(name = "seq_tarefa", allocationSize = 1, sequenceName = "seq_tarefa")
    @Column(name = "id_tarefa")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_coclusao")
    private LocalDate dataConclusao;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "status")
    private String status;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "tarefa")
    private List<Anexo> anexos = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Responsavel responsavel;
}
