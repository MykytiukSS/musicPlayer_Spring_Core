package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

//@Component("rockMusic")
public class RockMusic implements Music{
    ArrayList<String> musicList= new ArrayList<>();
    { musicList.add("Wind cries Mary");
        musicList.add("Big gun");
        musicList.add("Du hast mich");}

    @Override
    public String getSong() {

        final Random random = new Random();
        String s = musicList.get(random.nextInt(musicList.size()));
        return  s;

    }
}
