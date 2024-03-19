package br.com.suzintech.matchdiary.usecase.match;

import br.com.suzintech.matchdiary.database.entity.MatchEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class CalculaQuantidadeVitoria {

    public Integer executar(List<MatchEntity> list) {
        AtomicInteger quantity = new AtomicInteger();

        list.forEach(item -> {
            var scoreTeamOne = item.getScoreTeamOne();
            var scoreTeamTwo = item.getScoreTeamTwo();
            Long idTeamWinner = 0L;

            if (scoreTeamOne > scoreTeamTwo) {
                idTeamWinner = item.getTeamOne().getId();
            } else if (scoreTeamOne < scoreTeamTwo) {
                idTeamWinner = item.getTeamTwo().getId();
            }

            if (Objects.equals(item.getTeamSupported().getId(), idTeamWinner)) {
                quantity.addAndGet(1);
            }
        });

        return quantity.get();
    }
}
