package vaulthacker;

/**
 * Hacker thread instance that cracks key using Descending brute force approach
 */
public class DescendingHackerThread extends HackerThread {

    public DescendingHackerThread(Vault vault) {
        super(vault);
    }

    public void run() {
        for(int i = 9999; i >= 1; --i) {
            try {
                if (this.vault.isKeyMatching(i)) {
                    System.out.println("Key " + i + " found by " + this.getName() + " thread");
                    System.exit(0);
                }
            } catch (InterruptedException var3) {
                InterruptedException e = var3;
                throw new RuntimeException(e);
            }
        }

    }
}

