package com.joke.api.Service;

import com.joke.api.Entity.JokeEntity;
import com.joke.api.Repository.JokeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class JokeService {

    @Autowired
    private JokeRepository joke;

    public List<JokeEntity> getAlljoke(){
        return joke.findAll();
    }

    public Optional<JokeEntity> getRandomjoke(){
        Random rand = new Random();
        return joke.findById( Integer.toString(rand.nextInt( 31 )+1));
    }

    public String addjoke(JokeEntity newjoke){
        joke.save(newjoke);
        return "Success";
    }

    public String delejoke(String id){
        joke.deleteById(id);
        return "Success";
    }

    public String updatejoke(JokeEntity update){
        Optional<JokeEntity> updatejoke = joke.findById(update.getId());

        if(!(updatejoke.isPresent())){
            return "Fail";
        }else{
            Optional.of(joke.save(update));
            return "Success";
        }

    }
}
