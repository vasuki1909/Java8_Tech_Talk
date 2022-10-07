package lambda;

@FunctionalInterface
interface Alphabet{
    void show();
}

class Vowels implements Alphabet{

    @Override
    public void show() {
        System.out.println("Hi");
    }
}
//we can see here that the class Vowels is used only for implemeting A and there is no other purpose for it

public class LambdaDemo {
    public static void main(String[] args) {
       Alphabet alphabet = ()-> System.out.println("Hii I m a lambda expression example");
       alphabet.show();




/*
        Alphabet alphabet = ()-> System.out.println("hi");
       // alphabet = new Vowels();

        alphabet =()->
                System.out.println("HI");*/
        };
       // alphabet.show();
      /*  alphabet = new Alphabet(){
            @Override
            public void show() {
                System.out.println("hi");
            }
        };
     *//*   alphabet = () ->
        {
            System.out.println("hi");
        }; *//*
        alphabet =() -> System.out.println("hi");
        alphabet.show();*/

        //advantage of lambda expression = we dont have another class here
    }

