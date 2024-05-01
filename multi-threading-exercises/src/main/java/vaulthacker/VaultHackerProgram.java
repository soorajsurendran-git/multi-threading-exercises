package vaulthacker;

import java.util.Random;

/**
 * Vault Hacking program class
 */
public class VaultHackerProgram {

    public static final int MAX_KEY_VALUE = 9999;

    /**
     * Create 3 threads of AscendingHackerThread, DescendingHackerThread, and Police Thread
     * AscendingHacker thread tried to crack key by brute forcing key from 1 to 9999
     * DescendingHacker thread tried to crack key by brute forcing key from 9999 to 1
     * Police thread catches the Hacker threads after 10 seconds
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        Vault vault = new Vault(random.nextInt(MAX_KEY_VALUE));
        Thread ascendingThread = new AscendingHackerThread(vault);
        Thread descendingThread = new DescendingHackerThread(vault);
        Thread policeThread = new PoliceThread();
        ascendingThread.start();
        descendingThread.start();
        policeThread.start();
    }
}

