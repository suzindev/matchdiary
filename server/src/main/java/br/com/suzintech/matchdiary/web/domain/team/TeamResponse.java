package br.com.suzintech.matchdiary.web.domain.team;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponse {

    private Long id;
    private String name;
    private String state;
    private String photoUrl;
}
