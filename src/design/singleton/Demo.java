package design.singleton;
public class Demo {
    public static void main(String[] args) {
        Database db1 =  Database.getInstance();
        Database db2 =  Database.getInstance();


        if(db1 == db2) {
            System.out.println("hai object nay la 1");
        } else {
            System.out.println("hai object nay la 2");
        }
    }
}