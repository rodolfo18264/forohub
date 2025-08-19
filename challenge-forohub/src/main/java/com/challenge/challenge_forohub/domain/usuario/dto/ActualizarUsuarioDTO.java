package com.challenge.challenge_forohub.domain.usuario.dto;

import com.challenge.challenge_forohub.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
