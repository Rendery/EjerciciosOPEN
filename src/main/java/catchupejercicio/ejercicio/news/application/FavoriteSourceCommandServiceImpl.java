package catchupejercicio.ejercicio.news.application;

import catchupejercicio.ejercicio.news.domain.services.FavoriteSourceCommandService;

public class FavoriteSourceCommandServiceImpl implements FavoriteSourceCommandService {


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Optional<FavoriteSource> handle(GetFavoriteSourceByIdCommand command) {

        return Optional.empty();

    }

    @Override

    public Optional<List<FavoriteSource>> handle(GetFavoriteSourceCommand command) {

        return Optional.empty();

    }

}
}
