import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        int ARRAYSIZE= 5;
        String[] studentList= new String[ARRAYSIZE]; //Declarando el Array y asignando el largo
        /*studentList[0]= "Camila";
        studentList[1]= "Diana";
        studentList[2]= "Andy";
        studentList[3]= "Pao";
        studentList[4]= "Flor";*/

        Scanner sc= new Scanner(System.in);

        int[] theFair= new int[14];

        int i,total, average, max, min;
        total=0;




        for(i=0; i<theFair.length; i++){
            System.out.println("How many visitor for day " + (i +1) + ": " );
            theFair[i]=sc.nextInt();
            total+= theFair[i];
        }
        System.out.println("Total of visitors = " + total);

        average= total/theFair.length;
        System.out.println("The average is: " + average);

        max= theFair[0];
        min= theFair[0];
        for (i=0; i<theFair.length; i++){
            if (theFair[i] > max) {
               max= theFair[i];
            }else if(theFair[i]< min){
                min= theFair[i];
            }
        }

        System.out.println("The Max is: " + max);
        System.out.println("The Min is: " + min);
    }
}
