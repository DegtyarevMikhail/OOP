package GeekBrains;

import static GeekBrains.Employee.getOver40old;

public class Main {

    public static <persArray> void main(String[] args) {
        Employee[] persArray = new Employee[5];// write your code here
        persArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000,30);
        persArray[1] = new Employee("Petrov Petr", "Engineer", "petrov@mailbox.com", "892312312", 30000,30);
        persArray[2] = new Employee("Mikhailov Mikhail", "Engineer", "mikhailov@mailbox.com", "892312312", 30000,42);
        persArray[3] = new Employee("Dmitriev Dmitry", "Engineer", "dmitriev@mailbox.com", "892312312", 30000,41);
        persArray[4] = new Employee("Alexandrov Alexandr", "Engineer", "alexandrov@mailbox.com", "892312312", 30000,41);
        System.out.println(persArray.toString());
        getOver40old(persArray);
        //printArray(persArray);
    }

        static void printArray(Employee[] persArray){
            for (Employee person : persArray){
                System.out.println(person.toString());
            }
        }

}
