import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        int numLine = scanner.nextInt();
        ArrayList<ArrayList> list = new ArrayList<ArrayList>();

        for(int i=0; i< numLine; i++){
            int numLineInt = scanner.nextInt();
            ArrayList<Integer> intArray = new ArrayList<Integer>();

            for(int k=0;k<numLineInt;k++){
                intArray.add(new Integer(scanner.nextInt()));
            }
            list.add(intArray);
            scanner.nextLine();
        }
        int check = scanner.nextInt();
        for(int i =0;i<check;i++){
            int x = scanner.nextInt()-1;
            int y = scanner.nextInt()-1;

            try{
                System.out.println(list.get(x).get(y));
            }catch (IndexOutOfBoundsException e){
                System.out.println("ERROR!");
            }


        }

    }
}
