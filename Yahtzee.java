import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Yahtzee
{
    Die6 dieA;
    Die6 dieB;
    Die6 dieC;
    Die6 dieD;
    Die6 dieE;
    int number;
    public Yahtzee() {
        dieA = new Die6();
        dieB = new Die6();
        dieC = new Die6();
        dieD = new Die6();
        dieE = new Die6();
    }

    public void allRoll() {
        dieA.roll();
        dieB.roll(); 
        dieC.roll(); 
        dieD.roll(); 
        dieE.roll();
    }
    
    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            dieA.roll();
        } else if (dieNumber == 2) {
            dieB.roll();
        } else if (dieNumber == 3) {
            dieC.roll(); 
        } else if (dieNumber == 4) {
            dieD.roll();
        } else if (dieNumber == 5) {
            dieE.roll();
        }
    }
        
    public int getvalue1() {
        return dieA.getValue();
    }
    public int getvalue2() {
        return dieB.getValue();
    }
    public int getvalue3() {
        return dieC.getValue();
    }
    public int getvalue4() {
        return dieD.getValue();
    }
    public int getvalue5() {
        return dieE.getValue();
    }
    
    public int rollAndGetValue() {
        allRoll();
        return getvalue1(); 
    }
    
    public String summarize() {
        
    }
    private int countDie;
    
    public String ToString() {
        return "Dice values: " + dieA.getValue() + " "  + dieB.getValue() + " " + dieC.getValue() + " " + dieD.getValue() + " " + dieE.getValue() + " ";
    }
}
