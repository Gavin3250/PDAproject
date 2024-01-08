public class Dice
{
    //instance variables - replace the example below with your own
    private int value;
    
    public Dice() {
        roll();
    }
    
    public void roll() {
        value = (int)(Math.random()*6)+1;
    }
    
    public int getvalue() {
        return value;
    }
    
    public int rollAndGetValue(){
        roll();
        return getvalue();
    }
}