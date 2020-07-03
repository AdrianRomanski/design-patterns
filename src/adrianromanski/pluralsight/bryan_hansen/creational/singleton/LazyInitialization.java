package adrianromanski.pluralsight.bryan_hansen.creational.singleton;

import java.util.Objects;

public class LazyInitialization {

    private static LazyInitialization INSTANCE = null;

    private LazyInitialization() { }

    public synchronized static LazyInitialization getInstance() {
        if(Objects.isNull(INSTANCE)) {
            INSTANCE = new LazyInitialization();
        }
        return INSTANCE;
    }
}
