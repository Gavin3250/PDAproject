package New;

public class Die6
{
    //instance variables - replace the example below with your own
    private int value;
    
    public Die6() {
        roll();
    }
    
    public void roll() {
        value = (int)(Math.random()*6)+1;
    }
    
    public int getValue() {
        return value;
    }
    
    public int rollAndGetValue(){
        roll();
        return getValue();
    }
}
