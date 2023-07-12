package MOCK_TEST;

class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Question_2_3 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Anirudh");
        person.setAge(20);
        person.setAddress("Rohtak Road,Jind");

        String name = person.getName();
        int age = person.getAge();
        String address = person.getAddress();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
