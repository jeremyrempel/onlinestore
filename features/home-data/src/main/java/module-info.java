module onlinestore.features.home.data {
    exports com.github.jeremyrempel.onlinestore.home.data to onlinestore.features.home.api;

    requires spring.data.mongodb;
    requires spring.data.commons;
    requires org.mongodb.bson;
}
