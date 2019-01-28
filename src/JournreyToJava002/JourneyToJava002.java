package JournreyToJava002;


public class JourneyToJava002 {

    public static void main(String[] args){
        String my_first_string = "My Journey to Java, by Islam Taha";
        System.out.println(my_first_string.length()); // length of string
        System.out.println(my_first_string.charAt(0));
        System.out.println(my_first_string.indexOf("Islam"));
        System.out.println(my_first_string.replace("Islam Taha", "0xIslamTaha"));

        String credential = "admin:admin";
        if (credential=="admin:admin"){
            System.out.println("Hi! Admin");
        }else{
            System.out.println("sorry!");
        }

        String loop_problem="My Journey To Java By 0xIslamTaha";
        for (int i=0; i<loop_problem.length(); i++){
            System.out.println(loop_problem.charAt(i));
        }

        int x = 0;
        while (x<loop_problem.length()){
            System.out.println(loop_problem.charAt(x));
            x++;
        }

    }

}
