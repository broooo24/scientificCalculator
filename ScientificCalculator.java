import java.util.Random;

public class ScientificCalculator {
    private double firstNumber;
    private double secondNumber;

    public ScientificCalculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public ScientificCalculator(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double add(){
        return this.firstNumber+this.secondNumber;
    }

    public double divide(){
        return this.firstNumber/this.secondNumber;
    }

    public double subtract(){
        return this.firstNumber-this.secondNumber;
    }

    public double multiply(){
        return this.firstNumber*this.secondNumber;
    }

    public double square(){
        return this.firstNumber*this.firstNumber;
    }

    public double root(){
        return Math.sqrt(this.firstNumber);
    }

    public double getcos(){
        return Math.cos(this.firstNumber);
    }

    public double getsin(){
        return Math.sin(this.firstNumber);
    }

    public double gettan(){
        return Math.tan(this.firstNumber);
    }

    public double floor(){
        return Math.floor(this.firstNumber);
    }

    public double generateRandom(){
        Random random = new Random();
        return random.nextDouble();
    }

    public double absolute(){
        return Math.abs(this.firstNumber);
    }

    public double reciprocal(){
        return 1/this.firstNumber;
    }

    public double ln(){
        return (-Math.log(1-this.firstNumber))/this.firstNumber;
    }

    public double log(){
        return Math.log(this.firstNumber);
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}
