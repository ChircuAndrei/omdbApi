package com.codecool.omdb.repository;

import com.codecool.omdb.model.Favourites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavRepository extends JpaRepository<Favourites, Long> {
    Favourites save(Favourites save);

}
