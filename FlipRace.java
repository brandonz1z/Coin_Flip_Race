/*Name: Brandon Simpson
 *Course: Csc 135
 *Project: Ecinclasslab
 *FileName: FlipRace.java
*/
public class FlipRace {
    
 
public static void main (String [] args)

{

    Coin myCoin1 = new Coin ();
    Coin myCoin2 = new Coin ();
    
    int HEADS2 = 0;
    int HEADS3 = 0;
    int FLIPS = 0;

    String str1 = "";
    String str2 = "";

    while(HEADS2 < 3 && HEADS3 < 3)

    {  
      FLIPS++;

      myCoin1.flip();

      if(myCoin1.isHeads())

          HEADS2++;

        else

            HEADS2 = 0;

        str1 = str1 + " " + myCoin1.toString();

         

        myCoin2.flip();

        if(myCoin2.isHeads())

            HEADS3++;

        else

            HEADS3 = 0;

        str2 = str2 + " " + myCoin2.toString();

    }
    if(HEADS2 == HEADS3)

      System.out.println("Both won with " + str1 + " and " + str2);
    else if(HEADS2 == 3)

      System.out.println("Coin 1 won with " + str1 + " the looser had: " + str2);
    else

      System.out.println("Coin 2 won with " + str2 + " \nThe Looser had: " + str1);

     System.out.println("It took " + FLIPS + " flips");
}
}
