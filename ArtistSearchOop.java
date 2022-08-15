/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package artistsearchoop;

/**
 *
 * @author arnol
 */
import java.util.Scanner;

public class ArtistSearchOop {

    public void run(String[] args) throws Exception {
    int totalAttempts = 6; // attempt counter
//    while (totalAttempts != 0) {
    String[] artist = {"Master KG", "DJ B Coffee", "Bruno Mars", "F Fighters", "T Swift"};
    long[][] sales = new long[5][4];
        sales[0][0] = 900000L;
        sales[0][1] = 800000L;
        sales[0][2] = 500000L;
        sales[0][3] = 2200000L;

        sales[1][0] = 700000L;
        sales[1][1] = 500000L;
        sales[1][2] = 500000L;
        sales[1][3] = 1700000L;

        sales[2][0] = 800000L;
        sales[2][1] = 100000L;
        sales[2][2] = 50000L;
        sales[2][3] = 950000L;

        sales[3][0] = 100000L;
        sales[3][1] = 200000L;
        sales[3][2] = 200000L;
        sales[3][3] = 500000L;

        sales[4][0] = 300000L;
        sales[4][1] = 100000L;
        sales[4][2] = 50000L;
        sales[4][3] = 450000L;


        Scanner sc = new Scanner(System.in);
        System.out.println("Artist Name    DVD Sales     Blu Ray Sales      CD Sales "
        + "\n-------------------------------"
        + "\n1. Master KG    900000      800000     500000"
        + "\n2. DJ B Coffee  700000      500000     500000"
        + "\n3. Bruno Mars   800000      100000     50000"
        + "\n4. F Fighters   100000      200000     200000"
        + "\n5. T Swift      300000      100000     50000"
        + "\n-------------------------------"
        + "\n   Total        2800000     1700000    1300000");
        
        while (totalAttempts >= 1) {
            System.out.println("Please Enter a Number between 0 and 6: ");
            String position = sc.nextLine();
            
//            while (totalAttempts >= 0) {
            //check input format(only digits)
            if(!position.matches("\\d+")) {
                totalAttempts--;
                System.out.println("Wrong format attempts left: " + totalAttempts + "\nTry Again");
            } 
            else if(Integer.parseInt(position) > 5 || Integer.parseInt(position) < 1 ){
                System.out.println("Artist in this position does not exist, attempts left: " + totalAttempts + "\nTry Again");
                totalAttempts--;
            } 
            else {
                int pos = Integer.parseInt(position) - 1;
                System.out.println("Artist Name: " + artist[pos]);
                long albumSum = sales[pos][0] + sales[pos][1] + sales[pos][2];
                System.out.println("CD Sale: " + sales[pos][0] + "\nDVD Sale: " + sales[pos][1] + "\nBlu ray Sale: " + sales[pos][2]);
                System.out.println("Total: " + albumSum);
//                totalAttempts--;
            }
        }
        if(totalAttempts == 0) {
        System.out.println("Used up all 6 attempts sorry");
        }
    }
   public static void main (String[] args){
    try{
        ArtistSearchOop obj = new ArtistSearchOop ();
        obj.run (args);
    }
    catch (Exception e){
        e.printStackTrace ();
    }
  }
}