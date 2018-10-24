package com.joke.api.Controller;

import com.joke.api.Entity.JokeEntity;
import com.joke.api.Service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class JokeController {

    @Autowired
    private JokeService joke;

    @RequestMapping(value = "/Alljoke", method= RequestMethod.GET)
    public List<JokeEntity> alljoke(){
        return joke.getAlljoke();
    }

    @RequestMapping(value = "/Randomjoke", method= RequestMethod.GET)
    public Optional<JokeEntity> randomjoke(){

        return joke.getRandomjoke();
    }

    @RequestMapping(value = "/Addjoke", method= RequestMethod.POST)
    public void addjoke(JokeEntity newjoke){
        joke.addjoke(newjoke);
    }

    @RequestMapping(value = "/Deletejoke", method= RequestMethod.POST)
    public void deletejoke(String id){
        joke.delejoke(id);
    }

    @RequestMapping(value = "/Updatejoke", method= RequestMethod.PUT)
    public void deletejoke(JokeEntity update){
        joke.updatejoke(update);
    }
}
