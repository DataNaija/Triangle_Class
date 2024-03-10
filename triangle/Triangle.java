package triangle;

public class Triangle {
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // Constructor that accept parameters
    public Triangle(double base, double height, double sideLenOne,
                    double sideLenTwo, double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

    }

    // Behaviour or Methods
    public  double findArea(){
        return  (this.base * this.height) / 2;
    }


}
