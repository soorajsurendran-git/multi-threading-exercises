package vaulthacker;

/**
 * Abstract class for Hacker thread
 */
public abstract class HackerThread extends Thread {
    /**
     * Vault instance
     */
    protected Vault vault;

    public HackerThread(Vault vault) {
        this.vault = vault;
        this.setName(this.getClass().getName());
        this.setPriority(10);
    }

    public void start() {
        super.start();
        System.out.println("starting thread " + this.getName());
    }
}
