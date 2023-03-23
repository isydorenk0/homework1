package Ex4;

import java.sql.Array;

public class main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("model " + (i + 1));
        }

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("model " + (i + 1));
        }
        for (Computer computer : computers) {
            System.out.println(computer.getModel());
        }
    }
}
