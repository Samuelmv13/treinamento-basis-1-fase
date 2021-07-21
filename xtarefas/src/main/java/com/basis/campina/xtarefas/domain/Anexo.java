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

@Entity
@Table(name = "TB_ANEXO")
@Getter
@Setter
public class Anexo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_anexo")
    @SequenceGenerator(name = "seq_anexo", allocationSize = 1, sequenceName = "seq_anexo", initialValue = 1)
    @Column(name = "id_anexo")
    private Long id;

    @Column(name = "file")
    private String file;

    @Column(name = "file_name")
    private String fileName;

}

