package backend;

public class Patient {
    private String name;
    private int age;
    private int height;
    private int ID;
    private static int count = 0;
    public Patient(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
        count++;
        this.ID = count;
    }
    public Patient() {

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
    public int getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Height: " + height + " ID: " + ID;
    }
}
