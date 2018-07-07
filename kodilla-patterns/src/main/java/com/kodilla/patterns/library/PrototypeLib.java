package com.kodilla.patterns.library;

public class PrototypeLib<T> implements Cloneable {

    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
