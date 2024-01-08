public class DieN {
    private int value; // Holds value of die
    private int numSides; // Holds number of sides
    
    public DieN(int numSides) { //lets you enter number of side
        this.numSides = numSides; //This line of code assigns the value of the variable `numSides` to the property `numSides` of an object. The object should have already been declared and instantiated for this line of code to be valid.
        this.roll(); //this is just what you are using in that moment
    }//this means in current use
    // so you can use that variable
    public int getValue() { //will return value
        return value;
    }
    
    public void roll() { //roll dice and randomizes number
        this.value = (int)(Math.random() * numSides) + 1;
    }
    
    public int rollAndGetValue() { //combines the two methods into a single method call
        roll();
        return getValue();
    }
}