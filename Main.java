package root;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(CharCounter.count(text).toString());


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // test foreach, this is a sort of nifty foreach syntax.
        testForeach();
    }
    public static void testForeach() {
	// write your code here
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < 10; i ++)
        {
            list.add((int)(Math.random() * 100));
        }
        for(Integer i : list)
        {
            System.out.println("ELEMENT OF list:\t" + i);
        }

    }
}
