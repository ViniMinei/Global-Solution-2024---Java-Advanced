package br.com.fiap.exemploMVC.SusEarth.domainmodel;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TB_INSTRUMENTO")
public class Coleta {
    @Id
    @Column(name = "ID_INSTRUMENTO")
    @GeneratedValue(generator = "SQ_INSTRUMENTO",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_INSTRUMENTO",sequenceName = "SQ_INSTRUMENTO",allocationSize = 1)
    private Long id;

    private String nomeItem;

    private String nivelPerigo;

    private String tamanho;

    private Integer quantidade;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coleta coleta)) return false;
        return id == coleta.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
