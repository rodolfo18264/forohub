package com.challenge.challenge_forohub.domain.curso.dto;

import com.challenge.challenge_forohub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo
) {
}
