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
@Table(name = "TB_PROGRESSO")
public class Riscos {

    @Id
    @Column(name = "ID_PROGRESSO")
    @GeneratedValue(generator = "SQ_PROGRESSO", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SQ_PROGRESSO", sequenceName = "SQ_PROGRESSO", allocationSize = 1)
    private Long id;


    private String riscos;


    private String prevencao;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "TB_PROGRESSO_USUARIO",
            joinColumns = {
                    @JoinColumn(
                            name = "PROGRESSO",
                            referencedColumnName = "ID_PROGRESSO",
                            foreignKey = @ForeignKey(name = "FK_PROGRESSO_USUARIO")
                    )
            }, inverseJoinColumns = {
            @JoinColumn(                    name = "USUARIO",
                    referencedColumnName = "ID_USUARIO",
                    foreignKey = @ForeignKey(name = "FK_USUARIO_PROGRESSO")
            )
    }
    )
    private Usuario usuario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Riscos riscos)) return false;
        return id == riscos.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}