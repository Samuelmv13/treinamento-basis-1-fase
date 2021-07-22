package com.basis.campina.xtarefas.service;

import com.basis.campina.xtarefas.domain.Anexo;
import com.basis.campina.xtarefas.repository.AnexoRepository;
import com.basis.campina.xtarefas.service.dto.AnexoDTO;
import com.basis.campina.xtarefas.service.dto.DocumentoDTO;
import com.basis.campina.xtarefas.service.feign.DocumentoClient;
import com.basis.campina.xtarefas.service.mapper.AnexoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnexoService {

    private final AnexoRepository repository;
    private final AnexoMapper anexoMapper;
    private final DocumentoClient documentoClient;

    public void salvar(List<AnexoDTO> anexoDTOs){
        List<DocumentoDTO> documentoDTOS = anexoDTOs.stream().map(AnexoDTO:: getDocumento).collect(Collectors.toList());
        documentoClient.salvar(documentoDTOS);
    }

    @Transactional
    public AnexoDTO obterPorId(Long id) {
        return anexoMapper.toDto(repository.findById(id).orElseThrow(() -> new RuntimeException("Tarefa não existente")));
    }

    public DocumentoDTO obter(String uuId){
        return documentoClient.obterDocumento(uuId).getBody();
    }
}