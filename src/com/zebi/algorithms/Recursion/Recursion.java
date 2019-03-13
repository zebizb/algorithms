package com.zebi.algorithms.Recursion;

import com.zebi.algorithms.AlgorithmInterface;

public class Recursion<T extends AlgorithmInterface> {
    private Object object;
    private T t;

    public Recursion(T t, Object obj) {
        this.object = obj;
        this.t = t;
    }

    public void init() {
        t.setData(this.object);
    }

    public void start() throws Exception {
        t.execute();
    }
}
