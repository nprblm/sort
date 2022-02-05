public class Main {

    public static void main(String[] args) {
        int [] array = {5, 4 ,7 ,2 ,9, 11, 3, 1};
        int arrayLenght = array.length;
        Sort.bubbleSort(array);
        Sort.shakerSort(array);
        Sort.combSort(array);
        Sort.insertionSort(array);
        Sort.selectionSort(array);
        Sort.quickSort(array,0, arrayLenght-1);
    }
}
