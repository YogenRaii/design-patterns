package design_patterns.composite_pattern.composite_pattern_hw;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class File implements FileSystem {
    private String name;
    private int sizeInBytes;
    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }
    public int getSizeInBytes() {
        return sizeInBytes;
    }
    public void print(){
        System.out.println("--- file "+name+" size="+getSizeInBytes()+" bytes");
    }
}