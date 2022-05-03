package util;

public class QueueOfUsers {

    public static int clientsInline = 52;
    public static int operatorsNumber = 3;
    static int currentUser = 0;


    public static synchronized void queue() {
        System.out.print("Operator " + Thread.currentThread().getId() + " start work with client: ");
        currentUser++;
        System.out.println("User " + currentUser);
        clientsInline--;
    }
}
