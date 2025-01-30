package dev.erica.loop;
import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public int num;

    // Constructor

    public MultiplicationTable(int num) {
        this.num = num;
    }

    // Métodos

    public List<String> genTable() {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(num + " x " + i + " = " + (num * i));
        }
        return table;
    }
    
}
