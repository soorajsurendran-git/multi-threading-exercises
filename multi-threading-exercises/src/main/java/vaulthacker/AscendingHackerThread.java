package vaulthacker;

/**
 * Hacker thread instance that cracks key using Ascending brute force approach
 */
public class AscendingHackerThread extends HackerThread {

    public AscendingHackerThread(Vault vault) {
        super(vault);
    }

    public void run() {
        for(int i = 1; i <= 9999; ++i) {
            try {
                if (this.vault.isKeyMatching(i)) {
                    System.out.println("Key " + i + " found by " + this.getName() + " thread");
                    System.exit(0);
                }
            } catch (InterruptedException exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}

