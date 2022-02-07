package com.github.jeremyrempel.onlinestore.home.api;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/api/home")
    public List<HomeItemApi> home() {
        return homeService.getHomeData();
    }

    /**
     * Reset all data. Only for demos
     */
    @PostMapping("/api/home/reset")
    public void reset() {
        homeService.deleteAll();
        homeService.save(new HomeItemApi("Bok Choy"));
        homeService.save(new HomeItemApi("Carrots"));
        homeService.save(new HomeItemApi("Lettuce"));
    }
}
