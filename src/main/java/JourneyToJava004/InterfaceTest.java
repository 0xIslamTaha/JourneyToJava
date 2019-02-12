package JourneyToJava004;



interface Interface_ex {
    public void implementME();
}


class implementation implements Interface_ex{
    @Override
    public void implementME() {
        System.out.println("Here is my body!");
    }
}

public class InterfaceTest{
    public static void main(String args[]) {
        implementation obj = new implementation();
        obj.implementME();
    }
}
