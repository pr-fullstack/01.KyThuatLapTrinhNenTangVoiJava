package basiclearning;

import java.util.ArrayList;
import java.util.Collections;

public class TimHieuVeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(60);

        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println(arrayList);
    }
}
