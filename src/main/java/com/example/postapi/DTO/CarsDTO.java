package com.example.postapi.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CarsDTO(
        @NotBlank String modelo,
        @NotBlank String fabricante,
        @NotBlank String dataFabricacao,
        @NotNull double valor,
        @NotNull int anoModelo) {
}