module onlinestore.main {
    // java6 library is namespaced by maven metadata
    // all public classes are exposed
    requires io.reactivex.rxjava2;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires java.annotation;
}