package com.challenge.challenge_forohub.domain.respuesta.validations.update;

import com.challenge.challenge_forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
