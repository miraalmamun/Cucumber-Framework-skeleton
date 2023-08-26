package mir.jsonjava;

import java.util.List;

public class JsonToJava {

    private String name;
    private String phone;
    private List<String> subject;

    private int age;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public List<String> getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
