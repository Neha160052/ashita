// Write Java code to define List . Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<Float> list = new ArrayList<>();

        list.add(2.5F);
        list.add(3.5F);
        list.add(4.5F);
        list.add(5.5F);
        list.add(6.5F);

        Iterator<Float> it = list.iterator();
        Float sum = 0.0F;
        while(it.hasNext()){
            Float value = it.next();
            sum = sum + value;
        }
        System.out.println(sum);
    }
}
