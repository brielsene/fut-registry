package br.com.fut.futregistry.domain.time;

import br.com.fut.futregistry.domain.endereco.Endereco;
import jakarta.validation.constraints.NotBlank;

public record TimeRequestDto (
        @NotBlank
        String nome,

        Endereco endereco

){
}
