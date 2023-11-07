package global.goit.edu;

public class Human {

    private final String name;
    private final String lastName;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                '}';
    }
}