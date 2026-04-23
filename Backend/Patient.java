package Backend;

public class Patient {
    private String name;
    private int age;
    private int height;
    private static int ID;
    public Patient(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        ID++;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public static int getID() {
        return ID;
    }
}
