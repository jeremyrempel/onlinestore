package com.github.jeremyrempel.onlinestore.home.api;

public record HomeItemApi(String id, String name) {
    public HomeItemApi(String name) {
        this(null, name);
    }
}
