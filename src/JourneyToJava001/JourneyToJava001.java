package JourneyToJava001;

public class JourneyToJava001 {

    double addition(double x, double y){
        subtraction(1,2);
        return x+y;
    }

    double subtraction(double x, double y){
        return x-y;
    }

    double multi(double x, double y){
        return x*y;
    }

    double divde(double x, double y){
        return x/y;
    }

    public static void main(String[] args) {
        int int_v = 10; // Integer numbers
        double dou_v = 140.13; // floating numbers
        char char_v = 'a'; // one character
        String str_v = "JourneyToJAva By Islam Taha"; // string

        System.out.println(int_v);
        System.out.println(dou_v);
        System.out.println(char_v);
        System.out.println(str_v);

        JourneyToJava001 journey_obj = new JourneyToJava001();
        System.out.println(journey_obj.addition(10.1, 10.2));
    }
}
