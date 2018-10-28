package com.eprogrammerz.examples.gof.patterns.composite.filesystem;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Link implements FileSystem {
    private String name;
    private String value;

    public Link(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getLink() {
        return value;
    }

    public void print() {
        System.out.println("--- value " + name + " to " + getLink());
    }

    @Override
    public int getSizeInBytes() {
        return 0;
    }
}
