package adrianromanski.pluralsight.bryan_hansen.creational.singleton.serialization;

import java.io.Serializable;
import java.util.Objects;

public class EagerInitializedSingleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final EagerInitializedSingleton INSTACE = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        if(Objects.nonNull(INSTACE)) {
            throw new RuntimeException("This class can only be access through getInstance");
        }
    }

    public static EagerInitializedSingleton getInstance() {
        return INSTACE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
