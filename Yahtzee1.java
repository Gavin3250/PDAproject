package New;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Yahtzee1
{
    private Die6 dieA;
    private Die6 dieB;
    private Die6 dieC;
    private Die6 dieD;
    private Die6 dieE;
    private Die6 dieF;
    private Die6[] dieset;
    
    public void roll() {
        dieA.roll();
        dieB.roll();
        dieC.roll();
        dieD.roll();
        dieE.roll();
        dieF.roll();
    }


   public void allRoll() {
        dieA.roll();
        dieB.roll();
        dieC.roll();
        dieD.roll();
        dieE.roll();
        dieF.roll();
    }
    
    public Yahtzee1(){
        dieA = new Die6();
        dieB = new Die6();
        dieC = new Die6();
        dieD = new Die6();
        dieE = new Die6();
        dieF = new Die6();
        dieset = new Die6[] {dieA, dieB, dieC, dieD, dieE,dieF};
        this.roll();
    }
    
    public void roll(int diceNumber) {
        if(diceNumber <= 6){ //this is the number on the dice itself
            dieset[diceNumber -1].roll();
        }
    }
    
    public String summarize() {
        int[] sideArray = {1, 2, 3, 4, 5, 6};
        int[] countArray = {0, 0, 0, 0, 0, 0};
        String organizer = "";
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                if(dieset[x].getValue() == sideArray[y]){
                    countArray[y] = countArray[y] + 1;
                }
            }
        }
        
        for(int i = 1; i < 6; i++){
                    organizer = organizer + i + "-" + countArray[i - 1]+ "; ";
                }
                return organizer;
                }
                
   
     public String toString(){
                    String str = "Dice values;";
                    for(int i = 0; i < 5; i++){
                        str = str + " " + dieset[i].getValue();
                    }
                    return str;    
                }   
        public int getAllValues() {
            return dieA.getValue()  + dieB.getValue()  + dieC.getValue()  + dieD.getValue()  + dieE.getValue()  + dieF.getValue();
        }
    }
