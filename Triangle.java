public class Triangle{
    private double sideA;
    private double sideB;
    private double sideC;

    //null constructor
    public Triangle(){
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    //parametrized constructor
    public Triangle(double sideA, double sideB, double sideC){
         this.sideA = sideA;
         this.sideB = sideB;
         this.sideC = sideC;
    }

    //copy constructor
    public Triangle(Triangle other){
        this.sideA = other.sideA;
        this.sideB = other.sideB;
        this.sideC = other.sideC;
    }

    //setters
    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public void setSideB(double sideB){
        this.sideB = sideB;
    }

    public void setSideC(double sideC){
        this.sideC = sideC;
    }

    //getters
    public double getSideA(){
        return sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public double getSideC(){
        return sideC;
    }

    //method to calculate perimeter
    public double perimeter(){
        return sideA + sideB + sideC;
    }

   // checking  Is-RightAngled by pythagorus theorum
    public boolean RightAngled(){
        double sideA = a, sideB = b, sideC = c;
      return  Math.abs(a*a + b*b - c*c)|| Math.abs(b*b + c*c - a*a)||Math.abs(a*a + c*c - b*b);
    }

    //@override
    public String toString(){
        return( sideA, sideB, sideC); 
    }



    //main.java
    public static void main(String[] args) {
        
        Triangle t = new Triangle();

        //setter
        t.setSideA(3);
        t.setSideB(4);
        t.setSideC(6);

        //getter
        System.out.println("TRIANGLE");
        System.out.println("SideA=" +t.getSideA());
        System.out.println("SideB=" +t.getSideB());
        System.out.println("SideC=" +t.getSideC());

        System.out.println("Perimeter of Triangle=" +t.perimeter());
        

    }
}

