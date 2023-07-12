package MOCK_TEST;

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle1 implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Question_2_4{
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        Rectangle1 rectangle = new Rectangle1();

        circle.draw();     
        rectangle.draw(); 
    }
}
