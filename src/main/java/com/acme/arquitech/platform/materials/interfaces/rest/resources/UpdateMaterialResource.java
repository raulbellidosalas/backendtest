package com.acme.arquitech.platform.materials.interfaces.rest.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public record UpdateMaterialResource(
        Integer quantity,
        @JsonProperty("exit_date")
        String exitDate
) {
}