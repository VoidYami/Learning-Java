   

public class OOP {
    static class Employee{
        int id;
        String name;
        int salary;

        public void printDetails(){
            System.out.println("my id is "+id);
            System.out.println("my id is "+name);
        }

        public int get_salary(){
            return salary;
        }

    }

    public static void main(String[] args) {
        Employee Dark = new Employee();
        Employee jon = new Employee();
        jon.id =33;
        jon.name = "lala black_lala";
        jon.salary =34;

        Dark.id = 32;
        Dark.name = "VoidYami";
        Dark.salary =40;

//        System.out.println(Dark.id);
//        System.out.println(Dark.name);
        Dark.printDetails();
        jon.printDetails();
        int salary = Dark.get_salary();
        System.out.println(salary);

    }
}
