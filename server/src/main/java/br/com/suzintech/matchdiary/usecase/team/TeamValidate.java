package br.com.suzintech.matchdiary.usecase.team;

import br.com.suzintech.matchdiary.web.domain.team.TeamRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class TeamValidate {

    public void executar(TeamRequest request) {
        if (Objects.isNull(request.getName()) || Objects.isNull(request.getState()) || Objects.isNull(request.getPhotoUrl())) {
            throw new RuntimeException("É obrigatório preencher os campos.");
        }
    }
}
