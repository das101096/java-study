package stackex;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    public List<Integer> array = new ArrayList<>();

    public void push(int data) {
        array.add(data);
    }

    public int pop() {
        if(array.size() == 0) {
            return 0;
        } else {
            return array.remove(array.size()-1);
        }
    }

}
