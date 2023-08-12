package zad20alishev44;

public class Elrctrocar {
    private int id;
    private class Motor{
        public void stertNotor(){
            System.out.println("Motor " + id + " is starting");
        }
    }
    public static class Battary{
        public void charge(){
            System.out.println("Battary is charging...");
        }
    }
    public Elrctrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.stertNotor();

        int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someObject = new SomeClass();
        test(someObject);
        System.out.println("Electrocar" + id + " is starting...");
    }
    private void test(Object object){

    }
}
