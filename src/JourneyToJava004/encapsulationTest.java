package JourneyToJava004;

class encapsulation {
    private String password = "";

    public void setPassword(String password_value){
        password = password_value;
    }

    public String getPassword(){
        return password;
    }
}


public class encapsulationTest{
    public static void main(String args[]) {
        encapsulation obj = new encapsulation();
        obj.setPassword("0xIslamTaha");
        System.out.println(obj.getPassword());
    }

}
