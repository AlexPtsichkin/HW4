package classes;

import util.QueueOfUsers;

public class OperatorThread extends Thread {
    @Override
    public void run() {
        while (QueueOfUsers.clientsInline > 0) {
            try {
                QueueOfUsers.queue();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (QueueOfUsers.clientsInline <= 0) {
                System.out.println("Operator " + Thread.currentThread().getId() + " has finished his work ");
            }
        }
    }
}
