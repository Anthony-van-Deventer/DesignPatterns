package builders;

public class ClassMember {
    String name;
    String type;

    @Override
    public String toString() {
        return "ClassMember{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public ClassMember(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
