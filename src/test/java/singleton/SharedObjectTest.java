package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharedObjectTest {
    @Test
    public void shouldReturnCurrentVersion() {
        var version = "1.0.0";
        SharedObject.getSharedObject().setCurrentVersion(version);
        assertEquals(version, SharedObject.getSharedObject().getCurrentVersion());
    }
}
