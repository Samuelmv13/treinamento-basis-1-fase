package com.basis.campina.xtarefas.web.rest;

import com.basis.campina.xtarefas.service.AnexoService;
import com.basis.campina.xtarefas.service.dto.AnexoDTO;
import com.basis.campina.xtarefas.service.dto.DocumentoDTO;
import com.basis.campina.xtarefas.service.feign.DocumentoClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/anexos")
@RequiredArgsConstructor
@Slf4j
public class AnexoResource {

    private final DocumentoClient documentoClient;
    private final AnexoService anexoService;

    @GetMapping("/{id}")
    public ResponseEntity<AnexoDTO> obterPorId(@PathVariable Long id){
        return ResponseEntity.ok(anexoService.obterPorId(id));
    }

    @GetMapping("/documento/{uuId}")
    public ResponseEntity<DocumentoDTO> obter(@PathVariable String uuId) {
        return ResponseEntity.ok(anexoService.obter(uuId));
    }
}
