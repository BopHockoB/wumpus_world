package grid;

public class Step {
    private int stepNumber;
    private int x;
    private int y;

    private int previousX;
    private int previousY;


    @Override
    public String toString() {
        return "Step" + stepNumber +
                " ["+ (previousX + 1) + ", " + (previousY + 1) + "]"
                + " --> "
                + "["+ (x + 1) + ", " + (y + 1) + "]";
    }

    public Step(int stepNumber, int x, int y, int previousX, int previousY) {
        this.stepNumber = stepNumber;
        this.x = x;
        this.y = y;
        this.previousX = previousX;
        this.previousY = previousY;
    }

    public int getPreviousX() {
        return previousX;
    }

    public void setPreviousX(int previousX) {
        this.previousX = previousX;
    }

    public int getPreviousY() {
        return previousY;
    }

    public void setPreviousY(int previousY) {
        this.previousY = previousY;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
