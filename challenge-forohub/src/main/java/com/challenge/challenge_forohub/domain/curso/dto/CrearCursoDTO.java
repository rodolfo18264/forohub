package com.challenge.challenge_forohub.domain.curso.dto;

import com.challenge.challenge_forohub.domain.curso.Categoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CrearCursoDTO(
        @NotBlank String name,
        @NotNull Categoria categoria
) {
}
