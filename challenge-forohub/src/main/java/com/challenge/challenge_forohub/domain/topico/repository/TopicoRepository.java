package com.challenge.challenge_forohub.domain.topico.repository;

import com.challenge.challenge_forohub.domain.topico.Estado;
import com.challenge.challenge_forohub.domain.topico.Topico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository {

    @SuppressWarnings("null")
    Page<Topico> findAll(Pageable pageable);

    Page<Topico> findAllByEstadoIsNot(Estado estado, Pageable pageable);

    Boolean existsByTituloAndMensaje(String titulo, String mensaje);

    Topico findByTitulo(String titulo);



}
