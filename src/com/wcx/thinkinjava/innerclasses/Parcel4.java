package com.wcx.thinkinjava.innerclasses;

/**
 * Created by wcx on 16-7-25.
 */
public class Parcel4 {
    private class PContents implements Contents {
        private  int i =11;
        @Override
        public int value() {
            return i;
        }
    }
}
