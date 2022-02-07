package com.github.jeremyrempel.onlinestore.home.data;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface HomeRepository extends MongoRepository<HomeItemData, String> {
}
