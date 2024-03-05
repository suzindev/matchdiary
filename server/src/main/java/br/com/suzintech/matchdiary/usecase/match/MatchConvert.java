package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import br.com.suzintech.matchdiary.usecase.team.ConsultaTeamPorId;
import br.com.suzintech.matchdiary.web.domain.match.MatchRequest;
import br.com.suzintech.matchdiary.web.domain.match.MatchResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MatchConvert {

    private final ConsultaTeamPorId consultaTeamPorId;

    public MatchResponse executar(MatchEntity entity) {
        return MatchResponse.builder()
                .id(entity.getId())
                .idTeamOne(entity.getTeamOne().getId())
                .idTeamTwo(entity.getTeamTwo().getId())
                .idTeamSupported(entity.getTeamSupported().getId())
                .scoreTeamOne(entity.getScoreTeamOne())
                .scoreTeamTwo(entity.getScoreTeamTwo())
                .date(entity.getDate())
                .build();
    }

    public MatchEntity executar(MatchRequest request) {
        return MatchEntity.builder()
                .date(request.getDate())
                .scoreTeamOne(request.getScoreTeamTwo())
                .scoreTeamTwo(request.getScoreTeamTwo())
                .teamOne(consultaTeamPorId.executar(request.getIdTeamOne()))
                .teamTwo(consultaTeamPorId.executar(request.getIdTeamTwo()))
                .teamSupported(consultaTeamPorId.executar(request.getIdTeamSupported()))
                .build();
    }

    public MatchEntity executar(MatchRequest request, MatchEntity entity) {
        entity.setDate(request.getDate());
        entity.setScoreTeamOne(request.getScoreTeamTwo());
        entity.setScoreTeamTwo(request.getScoreTeamTwo());
        entity.setTeamOne(consultaTeamPorId.executar(request.getIdTeamOne()));
        entity.setTeamTwo(consultaTeamPorId.executar(request.getIdTeamTwo()));
        entity.setTeamSupported(consultaTeamPorId.executar(request.getIdTeamSupported()));

        return entity;
    }
}
