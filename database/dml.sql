INSERT INTO team (name, state, photo_url) VALUES
('Flamengo', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/9/93/Flamengo-RJ_%28BRA%29.png'),
('Vasco', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/e/ef/Escudo_Vasco_2015.png'),
('Botafogo', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/c/cb/Escudo_Botafogo.png'),
('Fluminense', 'RJ', 'https://upload.wikimedia.org/wikipedia/commons/a/ad/Fluminense_FC_escudo.png'),
('São Paulo', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/4/4b/S%C3%A3o_Paulo_Futebol_Clube.png'),
('Palmeiras', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/1/10/Palmeiras_logo.svg'),
('Corinthians', 'SP', 'https://upload.wikimedia.org/wikipedia/pt/b/b4/Corinthians_simbolo.png'),
('Santos', 'SP', 'https://upload.wikimedia.org/wikipedia/commons/1/15/Santos_Logo.png'),
('Grêmio', 'RS', 'https://lh3.ggpht.com/-QD9kMw474CY/Y27VyMQTh6I/AAAAAAAAGgI/sNIjHFsp5rUsVXL2o2dWSFTDox6aGX1IgCNcBGAsYHQ/s700/gremio.png'),
('Internacional', 'RS', 'https://logodetimes.com/wp-content/uploads/internacional.png');

INSERT INTO match (date, id_team_one, score_team_one, id_team_two, score_team_two, id_team_supported) VALUES
('27/02/2024', 1, 2, 2, 1, 1),
('27/02/2024', 3, 1, 4, 2, 3),
('28/02/2024', 5, 3, 6, 0, 5),
('28/02/2024', 7, 2, 8, 2, 8),
('29/02/2024', 9, 1, 10, 3, 10),
('01/03/2024', 2, 2, 3, 2, 2),
('01/03/2024', 4, 0, 5, 1, 5),
('02/03/2024', 6, 1, 7, 1, 6),
('02/03/2024', 8, 2, 9, 0, 8),
('03/03/2024', 10, 1, 1, 2, 10);
