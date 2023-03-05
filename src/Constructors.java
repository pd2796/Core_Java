public class Constructors {
    /*
    Constructor is the blueprint of thr class.
    Constructor always return instance
    we need to crate the instance for call or return constructor
    constructor is like function
    "this" keyword we use in constructor for access attribute variable*/
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    static int numOfsize = 3;  // static variable
    public Constructors(double base,double height,double sideLenOne,double sideLenTwo,double sideLenThree)
    {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }
    public double findArea() {
        return (this.base * this.height)/2;
    }
}
