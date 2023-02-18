package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int count = 0;
        boolean sorted;
        int reduceScopeChceck = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            sorted = true;
            for (int j = 0; j < reduceScopeChceck; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    int tmp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = tmp;
                    sorted = false;
                }
                count++;
            }
            if (sorted) {
                break;
            }
            reduceScopeChceck--;
        }
        return count;
    }
}
