package test;

public class Testing {

    public static void helloUser(String[] users){
        for (String user:users) {
            System.out.println("Hello " + user);
        }
    }

    public static void main(String[] args){
        String[] names = {"Emilia", "Iwona", "Ania", "Adam", "Adrianna"};
        helloUser(names);
    }
}
