module onlinestore.features.home.data {
    exports com.github.jeremyrempel.onlinestore.home.data to onlinestore.features.home.api;

    requires spring.data.commons;
    requires spring.data.jpa;
    requires java.persistence;
    requires java.annotation;
    requires spring.context;
}
