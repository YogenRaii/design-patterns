package com.eprogrammerz.examples.gof.patterns.composite.code;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Directory {
    protected String name;
    protected Collection<File> fileList = new ArrayList<File>();
    protected Collection<Directory> dirList = new ArrayList<Directory>();

    public Directory(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("-- dir " + name + " size=" + computeSize() + " bytes");
        for (Directory dir : dirList) {
            dir.print();
        }
        for (File file : fileList) {
            file.print();
        }
    }

    public void addFile(File file) {
        fileList.add(file);
    }

    public void addDir(Directory directory) {
        dirList.add(directory);
    }

    public int computeSize() {
        int sizeInBytes = 0;
        for (File file : fileList) {
            sizeInBytes += file.getSizeInBytes();
        }
        for (Directory dir : dirList) {
            sizeInBytes += dir.computeSize();
        }
        return sizeInBytes;
    }
}