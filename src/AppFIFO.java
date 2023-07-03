import java.util.ArrayList;

public class AppFIFO {
    public static void main(String[] args) {
        FIFO fifo = new FIFO();
        fifo.push("a",5);
        fifo.push("b",3);
        fifo.push("d",3);
        fifo.push("n",9);
        System.out.println("popHighest()" + fifo.popHighest());
        System.out.println("popHighest()" + fifo.popHighest());
    }
}
