package JourneyToJava004;

class Parent{
    public void sound(){
        System.out.println("Generic sound method");
    }
}
class CatChild extends Parent{
    @Override
    public void sound(){
        System.out.println("Meow Meow");
    }
}
class DogChild extends Parent{
    @Override
    public void sound(){
        System.out.println("Haoo Haoo");
    }
}

public class polymorphismTest {
    public static void main(String args []){
        CatChild catObj = new CatChild();
        catObj.sound();

        DogChild dogObj = new DogChild();
        dogObj.sound();
    }

}

/* OUTPUT
Meow Meow
Haoo Haoo
 */