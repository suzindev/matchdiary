package br.com.suzintech.matchdiary.web.domain.reports;

import br.com.suzintech.matchdiary.web.domain.team.TeamResponse;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReportsResponse {

    private Integer matchesQuantity;
    private Integer winsQuantity;
    private Double winPercentage;
    private TeamResponse teamMostWatched;
    private Integer daysWithoutWatching;
}
