package application.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import application.record.QuestaoDTO;
import jakarta.persistence.Column;

@Entity
@Table(name = "questoes")
@Getter
@Setter
@NoArgsConstructor
public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String enunciado;

    public Questao(QuestaoDTO questao) {
        this.id = questao.id();
        this.enunciado = questao.enunciado();
    }
}