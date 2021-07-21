package com.basis.campina.xtarefas.service.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class TarefaDTO implements Serializable {

    private static final long serialVersionUID = 1829357490246486671L;

    private Long id;

    private String nome;

    private LocalDate dataConclusao;

    private LocalDate dataInicio;

    private String status;

    private List<AnexoDTO> anexo;

    private ResponsavelDTO responsavel;

}
