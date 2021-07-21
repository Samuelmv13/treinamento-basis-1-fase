package com.basis.campina.xdocumentos.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/documents")
@RequiredArgsConstructor
public class DocumentoResource {

    @GetMapping
    ResponseEntity<String> getString(){
        return new ResponseEntity<String>("Deu certo", HttpStatus.OK);
    }
}
