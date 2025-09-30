
public class Main{
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
