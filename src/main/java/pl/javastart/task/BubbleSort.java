package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {
        int count = 0;
        int breakeCount = 0;
        int lowerLoop = inputArray.length - 1;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < lowerLoop; j++) {
                if (inputArray[j] < inputArray[(j + 1 + inputArray.length) % inputArray.length]) {
                    breakeCount++;
                } else if (inputArray[j] > inputArray[j + 1]) {
                    int tmp = inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j];
                    inputArray[j] = tmp;
                }
                count++;
            }
            if (i == 0 && breakeCount == inputArray.length - 1) {
                break;
            } else if (i == 1 && breakeCount == inputArray.length * 2 - 4) {
                break;
            }
            lowerLoop--;
        }
        return count;
    }
}
