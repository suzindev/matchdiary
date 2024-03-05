package br.com.suzintech.matchdiary.usecase.team;

import br.com.suzintech.matchdiary.database.entity.TeamEntity;
import br.com.suzintech.matchdiary.web.domain.team.TeamRequest;
import br.com.suzintech.matchdiary.web.domain.team.TeamResponse;
import org.springframework.stereotype.Component;

@Component
public class TeamConvert {

    public TeamResponse executar(TeamEntity entity) {
        return TeamResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .state(entity.getState())
                .photoUrl(entity.getPhotoUrl())
                .build();
    }

    public TeamEntity executar(TeamRequest request) {
        return TeamEntity.builder()
                .name(request.getName())
                .state(request.getState())
                .photoUrl(request.getPhotoUrl())
                .build();
    }

    public TeamEntity executar(TeamRequest request, TeamEntity entity) {
        entity.setName(request.getName());
        entity.setState(request.getState());
        entity.setPhotoUrl(request.getPhotoUrl());

        return entity;
    }
}
