package org.example.operators;

public class AndOperator implements Operator{
    @Override
    public boolean calc(boolean a, boolean b) {
        return a && b;
    }
}
