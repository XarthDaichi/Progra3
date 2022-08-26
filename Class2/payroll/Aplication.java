
package payroll;

public class Application {
    public static void main(String[] args) {
        Employee e1;
        e1 = new Employee("Juan", "Perez", "111");

        Employee e2 = new Employee("Maria", "Mata", "222");
    
        System.out.println(e1.toString() + " --- C.C.: " + e1.iniTials());
        System.out.println(e2.toString() + " --- C.C.: " + e2.inTials());
    }

    public static void main2(String[] args) {
        Employee e1;
        e1 = new Employee("Juan", "Perez", "111");
        System.out.println(e1.toString());

        System.out.println(new Employee("Maria", "Mata").toString());
    }

    public static void main3(String[] args) {
        Employee e1, e2;
        e1 = new Employee("Juan", "Perez", "111");
        e2 = new Employee("Juan", "Perez", "111");
        System.out.println(e1==e2);
        System.out.println(e1.equals(e2));
    }
}