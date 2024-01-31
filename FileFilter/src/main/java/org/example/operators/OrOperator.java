package org.example.operators;

public class OrOperator implements Operator{
    @Override
    public boolean calc(boolean a, boolean b) {
        return a || b;
    }
}
