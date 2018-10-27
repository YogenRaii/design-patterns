package com.eprogrammerz.examples.gof.patterns.composite_pattern.code;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Drive {
    protected String name;

    protected Collection<File> fileList = new ArrayList<File>();
    protected Collection<Directory> dirList = new ArrayList<Directory>();
    public Drive(String name) {
        this.name = name;
    }
    public void addFile(File file){
        fileList.add(file);
    }
    public void addDir(Directory directory){
        dirList.add(directory);
    }
    public int computeSize(){
        int sizeInBytes=0;
        for (File file : fileList){
            sizeInBytes+=file.getSizeInBytes();
        }
        for (Directory dir : dirList){
            sizeInBytes+=dir.computeSize();
        }
        return sizeInBytes;
    }
    public void print(){
        System.out.println("- drive "+name);
        for (Directory dir : dirList){
            dir.print();
        }
        for (File file : fileList){
            file.print();
        }
    }
}