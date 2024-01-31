package org.example;

public class SingletonClass {
    private static SingletonClass singletonClass;

    private SingletonClass() {

    }
    public static SingletonClass getInstance() {
        if (singletonClass == null) {
            synchronized (SingletonClass.class) {
                if (singletonClass == null) {
                    return new SingletonClass();
                }
            }
        }
        return singletonClass;
    }
}
