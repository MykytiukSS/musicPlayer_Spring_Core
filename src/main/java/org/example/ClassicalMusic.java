package org.example;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component

public class ClassicalMusic implements Music{
    private List<String> musicList= new ArrayList<>();
    { musicList.add("Hungarian Rhapsody");
        musicList.add("Bohemian Rhapsody");
        musicList.add("Romanian Rhapsody");}

    @Override
    public String getSong() {

    final Random random = new Random();
     String s = musicList.get(random.nextInt(musicList.size()));
        return  s;
    }
}
