package vaulthacker;

/**
 * Implementation of Vault class
 */
public class Vault {
    private int key;

    public Vault(int key) {
        System.out.println("Key to crack is: "+key);
        this.key = key;
    }

    /**
     * Checks whether the inputKey matches with the key inside vault
     * Add 5 millisecond delay to slow down the hackers
     * @param inputKey input key
     * @return true if keys match, false OW
     * @throws InterruptedException
     */
    public boolean isKeyMatching(int inputKey) throws InterruptedException {
        Thread.sleep(5);
        return this.key == inputKey;
    }
}
