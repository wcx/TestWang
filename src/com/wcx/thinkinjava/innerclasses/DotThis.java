package com.wcx.thinkinjava.innerclasses;

/**
 * Created by wcx on 16-7-25.
 */
public class DotThis {
    void f() {
        System.out.print("DotThis.f()");
    }

    public class Inner {

        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
        DotThis.Inner dti2 = dt.new Inner();
    }
}
