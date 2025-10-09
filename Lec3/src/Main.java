import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i<100; i++){

            str.append(i);
            //System.out.println(str);
        }

        List<Integer> list = new ArrayList<>();

        int num = 30;

        Integer number = num; //Auto-Boxing
                                //Converting Primitive to Derived Data Type

        int num1 = number; //Auto-Unboxing
                            //Converting Derived to Primitive Data Type

        list.add(30); //int will be converted to Integer (Auto-Boxing)

        for (int i:list){ //Integer will be converted to int (Auto-Unboxing)
            System.out.println(i);
        }






    }
}









