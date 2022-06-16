module onlinestore.features.home.data {
    exports com.github.jeremyrempel.onlinestore.home.data;

    requires spring.data.commons;
    requires spring.data.jpa;
    requires java.persistence;
    requires java.annotation;
    requires spring.context;
}
