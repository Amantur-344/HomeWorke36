package LessonExample;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList<Multiple> multiples = new ArrayList<>();
        for (int i = 0; i < multiples.size(); i++) {
            int A = (int) (Math.random() * 20);
            int B = (int)(Math.random() * 20) ;

            int result = A * B;
            int result2 = A *B;

            if(result == result2){
             //   multiples.add(result);
            }
        }
    }
}
