package br.com.suzintech.matchdiary.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "team")
public class MatchEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "score_team_one")
    private Integer scoreTeamOne;

    @Column(name = "score_team_two")
    private Integer scoreTeamTwo;

    @ManyToOne
    @JoinColumn(name = "id_team_one")
    private TeamEntity teamOne;

    @ManyToOne
    @JoinColumn(name = "id_team_two")
    private TeamEntity teamTwo;

    @ManyToOne
    @JoinColumn(name = "id_team_supported")
    private TeamEntity teamSupported;
}
