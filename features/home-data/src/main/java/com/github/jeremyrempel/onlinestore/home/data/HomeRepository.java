package com.github.jeremyrempel.onlinestore.home.data;


import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<HomeItemData, String> {
}
