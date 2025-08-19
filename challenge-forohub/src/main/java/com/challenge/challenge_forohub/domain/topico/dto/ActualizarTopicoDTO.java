package com.challenge.challenge_forohub.domain.topico.dto;

import com.challenge.challenge_forohub.domain.topico.Estado;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
) {
}
