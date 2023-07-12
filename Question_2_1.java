package MOCK_TEST;
class Animal {
    public void makeSound() {
    	System.out.println("Sound made by animal.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog says: Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat says: Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow says: Moo!");
    }
}

public class Question_2_1{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); 

        Cat cat = new Cat();
        cat.makeSound(); 

        Cow cow = new Cow();
        cow.makeSound();      }
}
