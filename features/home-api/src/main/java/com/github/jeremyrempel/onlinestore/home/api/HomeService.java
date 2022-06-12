package com.github.jeremyrempel.onlinestore.home.api;

import com.github.jeremyrempel.onlinestore.home.data.HomeItemData;
import com.github.jeremyrempel.onlinestore.home.data.HomeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeService {

    HomeRepository repository;

    public HomeService(HomeRepository repository) {
        this.repository = repository;
    }

    public List<HomeItemApi> getHomeData() {
        return repository.findAll()
                .stream()
                .map(this::transform)
                .toList();
    }

    public void save(HomeItemApi item) {
        repository.save(transform(item));
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    private HomeItemData transform(HomeItemApi item) {
        return new HomeItemData(item.id(), item.name());
    }

    private HomeItemApi transform(HomeItemData data) {
        return new HomeItemApi(data.getId(), data.getName());
    }
}
