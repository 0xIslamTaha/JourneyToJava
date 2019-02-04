package JourneyToJava004;

class parent{
    public void eating(String animal){
        System.out.println(String.format("%s animal is eating", animal));
    }

    public void drinking(String animal){
        System.out.println(String.format("%s animal is drinking", animal));
    }
}

class childTwoLegs extends parent{
    public static String animalType = "twoLegs";

    public void twoLegs(){
        System.out.println("Animal with two legs");
    }
}

class childFourLegs extends parent{
    public static String animalType = "fourLegs";

    public void fourLegs(){
        System.out.println("Animal with four legs");
    }
}

public class InheritanceTest{
    public static void main(String args[]) {
        childTwoLegs obj_2_legs = new childTwoLegs();
        obj_2_legs.twoLegs();
        obj_2_legs.eating(obj_2_legs.animalType);
        obj_2_legs.drinking(obj_2_legs.animalType);

        childFourLegs obj_4_legs = new childFourLegs();
        obj_4_legs.fourLegs();
        obj_4_legs.eating(obj_4_legs.animalType);
        obj_2_legs.drinking(obj_4_legs.animalType);
    }
}
