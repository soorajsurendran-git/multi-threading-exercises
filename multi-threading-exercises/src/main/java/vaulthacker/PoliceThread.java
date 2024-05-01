
package vaulthacker;

/**
 * Police thread class
 */
public class PoliceThread extends Thread {
    public PoliceThread() {
    }

    /**
     * Police thread tries to catch the hacker threads
     * Counts down from 10 and if hacker threads have not cracked key,
     * then Police thread stops execution
     */
    public void run() {
        for(int i = 10; i >= 1; --i) {
            System.out.println("Police arrives in " + i + " seconds");

            try {
                Thread.sleep(1000L);
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }
        }

        System.out.println("Police caught the Hackers");
        System.exit(0);
    }
}
