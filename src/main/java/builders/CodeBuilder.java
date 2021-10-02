package builders;

public class CodeBuilder {
    private Class classElement = new Class();

    public CodeBuilder(String className){
        classElement.setClassName(className);
    }

    public CodeBuilder addField(String name, String type){
        ClassMember cm = new ClassMember(name, type);
        classElement.addClassMembers(cm);
        return this;
    }

    @Override
    public String toString() {
        return classElement.toString();
    }
}
