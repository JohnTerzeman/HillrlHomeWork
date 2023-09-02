package ex1;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S20");
        Student student1 = new Student("John", 20, phone);
        try {
            Student student2 = (Student) student1.clone();
            System.out.println("Original student: " + student1.getName() + " - " + student1.getMobilePhone().getBrand() + " " + student1.getMobilePhone().getModel());
            System.out.println("Cloned student: " + student2.getName() + " - " + student2.getMobilePhone().getBrand() + " " + student2.getMobilePhone().getModel());
            System.out.println("Are mobile phones equal? " + (student1.getMobilePhone() == student2.getMobilePhone()));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}