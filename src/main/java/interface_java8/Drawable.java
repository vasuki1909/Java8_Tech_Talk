package interface_java8;

public interface Drawable {
    static void draw()
    {
        System.out.println("hI i can draw");
    }
}

class B implements Drawable{


}

class Main{
    public static void main(String[] args) {
        Drawable.draw();

    }
}