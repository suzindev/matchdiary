package br.com.suzintech.matchdiary.web.domain.match;

import br.com.suzintech.matchdiary.web.domain.team.TeamResponse;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchResponse {

    private Long id;
    private LocalDate date;
    private Integer scoreTeamOne;
    private Integer scoreTeamTwo;
    private TeamResponse idTeamOne;
    private TeamResponse idTeamTwo;
    private TeamResponse idTeamSupported;
}
