package com.github.jeremyrempel.onlinestore.home.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("home_items")
public record HomeItemData(@Id Object id, String name) {
}
