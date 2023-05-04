package br.com.fut.futregistry.domain.time;

import br.com.fut.futregistry.domain.endereco.Endereco;

public record TimeResponseDto(Long id, String nome, Endereco endereco) {
    public TimeResponseDto(Time time){
        this(time.getId(), time.getNome(), time.getEndereco());
    }
}
