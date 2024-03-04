package br.com.suzintech.matchdiary.domain.team;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamRequest {

    private String name;
    private String state;
    private String photoUrl;
}
