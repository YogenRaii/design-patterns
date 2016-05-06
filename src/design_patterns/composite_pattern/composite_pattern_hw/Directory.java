package design_patterns.composite_pattern.composite_pattern_hw;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class Directory implements FileSystem{
    protected String name;
    protected Collection<FileSystem> fileSystems = new ArrayList<FileSystem>();
    public Directory(String name) {
        this.name = name;
    }
    public void addFileSystem(FileSystem fileSystem){
        fileSystems.add(fileSystem);
    }
    public int getSizeInBytes(){
        int sizeInBytes=0;
        for (FileSystem fileSystem : fileSystems){
            sizeInBytes+=fileSystem.getSizeInBytes();
        }
        return sizeInBytes;
    }
    public void print() {
        System.out.println("-- dir " + name + " size=" + getSizeInBytes() + " bytes");
        for (FileSystem fileSystem : fileSystems){
            fileSystem.print();
        }
    }
}