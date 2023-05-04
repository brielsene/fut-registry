package br.com.fut.futregistry.domain.time;

import br.com.fut.futregistry.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "time")
@Table(name = "time")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(of = "id")
@Builder
public class Time {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Embedded
    private Endereco endereco;

    public Time(TimeRequestDto data){
        this.nome = data.nome();
        this.endereco = data.endereco();
    }

}
