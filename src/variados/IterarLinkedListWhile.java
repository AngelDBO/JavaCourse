package variados;

import java.util.LinkedList;

public class IterarLinkedListWhile {
    public static void main(String[] args) {
        LinkedList<Integer> lkl = new LinkedList<>();
        lkl.add(1);
        lkl.add(2);
        lkl.add(3);
        lkl.add(4);
        lkl.add(5);

        int count = 0;
        while (count < lkl.size()) {
            System.out.println("lkl.get(count) = " + lkl.get(count));
            count++;
        }
        System.out.println("===============================");
        for (int i : lkl) {
            if (i == 4){
                break;
            }
            System.out.println("lkl.get(i) = " + i);
        }
        System.out.println("===============================");
        for (Integer integer : lkl) {
            if (integer == 2){
                continue;
            }
            System.out.println("lkl.get(i) = " + integer);
        }
    }
}
