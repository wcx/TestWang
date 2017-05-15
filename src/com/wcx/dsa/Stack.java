package com.wcx.dsa;

import java.util.Objects;

/**
 * Created by wcx on 16-6-2.
 */
public interface Stack {
    public int getSize();

    public boolean isEmpty();

    public Object top() throws ExceptionStackEmpty;

    public void push(Object ele);

    public Object pop() throws ExceptionStackEmpty;
}
