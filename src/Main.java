import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello Sugriva");
//        List<String> list = new ArrayList<>();
//        list.forEach(i -> list.add(i)) ;
//
//        list.forEach(i -> System.out.println(i)) ;

        try{
            bramaarrow(1,2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
    public static void bramaarrow(int a,int b) throws ArithmeticException{
        if(a+b > 0){
            throw new ArithmeticException("no matter what number you give it throws execption you dipshit");
        }
    }


}