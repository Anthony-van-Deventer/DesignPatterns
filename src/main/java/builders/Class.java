package builders;

import java.util.ArrayList;
import java.util.List;

public class Class {
    private String className;
    private List<ClassMember> classMembers = new ArrayList<>();

    public void setClassName(String className) {
        this.className = className;
    }

    public void addClassMembers(ClassMember classMember) {
        this.classMembers.add(classMember);
    }

    public Class() {
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Class{" +
                "className='" + className + '\'' +
                ", classMembers=" + classMembers +
                '}';
    }

    public List<ClassMember> getClassMembers() {
        return classMembers;
    }
}
