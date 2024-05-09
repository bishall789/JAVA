package Factory;

public class Demo {
    public static void main(String[] args) {

        Emp and = EmpFactory.getEmp("android");
        Emp ios = EmpFactory.getEmp("ios");

        System.out.println(and);
        System.out.println(ios);
    }

}
