import classes.OperatorThread;
import util.QueueOfUsers;

public class Main {
    public static void main(String[] args) {

        System.out.println("Call center start work");

        OperatorThread[] operators = new OperatorThread[QueueOfUsers.operatorsNumber + 1];
        /* Create array of operators (threads) */
        for (int i = 0; i <= QueueOfUsers.operatorsNumber; i++) {
            operators[i] = new OperatorThread();
        }

        /* start threads */
        for (int i = 0; i <= QueueOfUsers.operatorsNumber; i++) {
            operators[i].start();
        }


    }
}
