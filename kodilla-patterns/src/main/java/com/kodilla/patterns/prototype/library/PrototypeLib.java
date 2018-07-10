package com.kodilla.patterns.prototype.library;

public class PrototypeLib<T> implements Cloneable {

    public T clone() throws CloneNotSupportedException {
        return (T) super.clone();
    }
}
