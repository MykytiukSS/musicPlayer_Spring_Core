package org.example;

import org.springframework.stereotype.Component;


public class SoulMusic implements Music{
    @Override
    public String getSong() {
        return "This is the men's world";
    }
}
