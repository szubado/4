import java.util.*;

public class FIFO {
    private ArrayList<String> elementy;
    private ArrayList<Integer> priorytety;

    public FIFO() {
        elementy = new ArrayList<String>();
        priorytety = new ArrayList<Integer>();
    }

    public void push(String element, Integer priority) {
        elementy.add(element);
        priorytety.add(priority);
        System.out.println(element + " - " + priority);
    }
    private String pop(int index) {
        if (elementy.size() > index) {
            String temp = elementy.get(index);
            elementy.remove(index);
            priorytety.remove(index);
            return temp;
        }
        else {
            return null;
        }
    }
    public String popFirst() {
        return pop(0);
    }

    public String popHighThree() {
        if (elementy.size() > 0) {
            if (elementy.size() == 1) {
                return pop(0);
            }
            else if (elementy.size() == 2) {
                //pop zwaca element ale kasuje elem i prioryt
                return (priorytety.get(0) >= priorytety.get(1)) ? pop(0) : pop(1);
            }
            else {
                Integer tempPriority = -1;
                int tempPozycja = -1;
                for (int i = 2; i >= 0; i--) {
                    if (priorytety.get(i) >= tempPriority) {
                        tempPriority = priorytety.get(i);
                        // zapamietaj z ktorej pozycji priorytet przyjelismy za najwiekszy
                        tempPozycja = i;
                    }
                }
                return pop(tempPozycja);
            }
        }
        return null;
    }
    public String popHighest() {
        if (elementy.size() > 0) {
            Integer tempPriority = -1;
            int tempPozycja = -1;
            for (int i = elementy.size() - 1; i >= 0; i--) {
                if (priorytety.get(i) >= tempPriority) {
                    tempPriority = priorytety.get(i);
                    // zapamietaj z ktorej pozycji priorytet przyjelismy za najwiekszy
                    tempPozycja = i;
                }
            }
                return pop(tempPozycja);
        }
        return null;
    }
}
