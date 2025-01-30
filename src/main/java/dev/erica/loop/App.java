package dev.erica.loop;

import java.util.List;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultiplicationTable table = new MultiplicationTable(5);
        List<String> result = table.genTable();
        for (String line : result) {  
            System.out.println(line);
        }
    }
}
