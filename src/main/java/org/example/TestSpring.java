package org.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);


        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
//        musicPlayer.playMusic(MusicEnum.CLASSICAL);
//        musicPlayer.playMusic(MusicEnum.ROCK);
        System.out.println(musicPlayer.playMusic());
//        Computer computer =context.getBean("computer",Computer.class);
//        System.out.println(computer);
        context.close();
    }
}
