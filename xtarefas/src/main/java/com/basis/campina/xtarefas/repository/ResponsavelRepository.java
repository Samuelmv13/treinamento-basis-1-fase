package com.basis.campina.xtarefas.repository;

import com.basis.campina.xtarefas.domain.Responsavel;
import com.basis.campina.xtarefas.domain.elasticsearch.ResponsavelDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepository extends JpaRepository<Responsavel, Long> {

//    @Query("SELECT NEW com.basis.campina.xtarefas.domain.elasticsearch.ResponsavelDocument(" +
//            "o.id,o.nome,o.email,o.dataNascimento,o.tarefas) FROM Responsavel r WHERE  r.id = :id")
//    ResponsavelDocument getDocument(Integer id);
}
