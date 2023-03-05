package singleton;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SharedObject {
    private SharedObject() { }

    private String currentVersion;

    @Getter
    private static final SharedObject sharedObject = new SharedObject();
}
