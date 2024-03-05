package br.com.suzintech.matchdiary.web.domain.match;

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
    private Long idTeamOne;
    private Long idTeamTwo;
    private Long idTeamSupported;
}
