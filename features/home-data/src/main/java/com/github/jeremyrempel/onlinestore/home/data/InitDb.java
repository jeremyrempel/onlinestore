package com.github.jeremyrempel.onlinestore.home.data;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class InitDb {

    HomeRepository repository;

    public InitDb(HomeRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    private void initDb() {
        repository.saveAll(List.of(
                new HomeItemData(0L, "Soup"),
                new HomeItemData(0L, "Salad"),
                new HomeItemData(0L, "Cereal")
        ));

    }
}
