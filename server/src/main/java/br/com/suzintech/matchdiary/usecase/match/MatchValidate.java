package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.web.domain.match.MatchRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class MatchValidate {

    public void executar(MatchRequest request) {
        if (Objects.isNull(request.getDate()) || Objects.isNull(request.getIdTeamSupported())
                || Objects.isNull(request.getIdTeamOne()) || Objects.isNull(request.getIdTeamTwo())
                || Objects.isNull(request.getScoreTeamOne()) || Objects.isNull(request.getScoreTeamTwo())) {
            throw new RuntimeException("É obrigatório preencher os campos.");
        }
    }
}
