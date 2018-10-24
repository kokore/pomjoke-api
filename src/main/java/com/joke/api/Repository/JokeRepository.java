package com.joke.api.Repository;

import com.joke.api.Entity.JokeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeRepository extends JpaRepository<JokeEntity, String> {


}
