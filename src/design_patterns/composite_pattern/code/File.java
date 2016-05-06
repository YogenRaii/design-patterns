package design_patterns.composite_pattern.code;

/**
 * Created by ${YogenRai} on 4/9/2016.
 */
public class File {
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