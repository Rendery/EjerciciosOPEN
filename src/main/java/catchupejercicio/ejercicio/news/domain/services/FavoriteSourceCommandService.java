package catchupejercicio.ejercicio.news.domain.services;

import catchupejercicio.ejercicio.news.domain.commands.GetFavoriteSourceByIdCommand;
import catchupejercicio.ejercicio.news.domain.commands.GetFavoriteSourceCommand;
import catchupejercicio.ejercicio.news.domain.model.aggregates.FavoriteSource;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceCommandService {

    Optional<FavoriteSource> handle(GetFavoriteSourceByIdCommand Command);

    Optional<List<FavoriteSource>> handle(GetFavoriteSourceCommand Command);

}
