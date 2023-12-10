public class Main {
    public static void main(String[] args) {

        Employee w1 = new Employee("Hera", 2000.0,45,1985);
        Employee w2 = new Employee("Alp", 3500.0,45,1970);

        System.out.println("çalışan 1: " );
        System.out.println( w1.toString());

        System.out.println("çalışan 2: " );
        System.out.println( w2.toString());

    }
}