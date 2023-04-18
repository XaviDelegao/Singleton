package org.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("Les instancies son iguals");
            System.out.println("s1: " + s1.getUuid());
            System.out.println("s2: " + s2.getUuid());
        } else {
            System.out.println("Les instancies son diferents");
        }
    }
}

