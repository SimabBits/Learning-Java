
public class BubbleSorting {

    static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {

                boolean swapped = false;

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;

                    swapped = true;

                }

                if (!swapped) {
                    break;
                }

            }

        }

    }

    public static void main(String[] args) {

        int[] array = {8};

        bubbleSort(array);

        for (int el : array) {

            System.out.print(el + " ");

        }

    }

}
