package org.singleton;
import java.util.UUID;

public class Singleton {
    private static Singleton instance = null;
    private static Object mutex = new Object();
    private UUID uuid;

    private Singleton() {
        this.uuid = UUID.randomUUID();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (mutex) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
