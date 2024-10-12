package catchupejercicio.ejercicio.news.domain.services;

import catchupejercicio.ejercicio.news.domain.model.aggregates.FavoriteSource;
import catchupejercicio.ejercicio.news.domain.model.queries.GetFavoriteSourceByIdQuery;
import catchupejercicio.ejercicio.news.domain.model.queries.GetFavoriteSourceQuery;

import java.util.List;
import java.util.Optional;

public interface FavoriteSourceQueryService {

    Optional<FavoriteSource> handle(GetFavoriteSourceByIdQuery query);

    Optional<List<FavoriteSource>> handle(GetFavoriteSourceQuery query);

}
