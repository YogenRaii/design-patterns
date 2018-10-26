package design_patterns.command_pattern.example;

/**
 * receiver class
 */
public class MobilePhone {
    public void unlockPhone(){
        System.out.println("Phone screen unlocked.");
    }
    public void lockPhone(){
        System.out.println("Phone screen locked.");
    }
}
