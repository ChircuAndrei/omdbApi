package com.codecool.omdb.service;

import com.codecool.omdb.model.Favourites;
import com.codecool.omdb.repository.FavRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class FavService {
    private final FavRepository favRepository;
    @Autowired
    public FavService(FavRepository favRepository) {
        this.favRepository = favRepository;
    }

    public void addFav(Favourites favourite) {
        favRepository.save(favourite);
    }

    public List<Favourites> getAllFavs() {
        return favRepository.findAll();
    }
    public Optional<Favourites> findById(String id) {

        return favRepository.findById((Favourites) getAllFavs().stream().filter(movie -> movie.getImdbID().equals(id)));
    }
    public void deleteFav(Favourites favourite) {
        favRepository.delete(favourite);
    }
    public void deleteByID(Favourites favourite) {
        favRepository.deleteById(favourite.getId());
    }
}
