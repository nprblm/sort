public class Sort {

    public static void bubbleSort(int [] array)
    {
        long startTime = System.nanoTime();
        long endTime;
        int swap;
        boolean sorted;
        int arraySize = array.length-1;

        while(true)
        {
            sorted = true;

            for(int i = 0 ; i < arraySize ; i++)
            {
                if(array[i]>array[i+1])
                {
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    sorted = false;
                }
            }

            arraySize--;

            if(sorted)
                break;
        }

        endTime = System.nanoTime();

        printArray("Bubble Sort:", array);

        printTime(startTime, endTime);
    }

    public static void shakerSort(int []array)
    {
        long startTime = System.nanoTime();
        long endTime;
        int start = 0;
        int end = array.length-1;
        int swap;
        boolean sorted;

        while(true)
        {
            sorted=true;

            for (int i = start; i < end; i++)
            {
                if(array[i]>array[i+1])
                {
                    swap = array[i];
                    array[i] = array[i+1];
                    array[i+1] = swap;
                    sorted = false;
                }
            }

            end--;

            for (int i = end; i < start; i--)
            {
                if(array[i]<array[i-1])
                {
                    swap = array[i];
                    array[i] = array[i-1];
                    array[i-1] = swap;
                    sorted = false;
                }
            }
            start++;

            if(sorted)
                break;
        }

        endTime = System.nanoTime();

        printArray("Shaker Sort:", array);

        printTime(startTime, endTime);
    }

    public static void combSort(int []array)
    {
        long startTime = System.nanoTime();
        long endTime;
        int swap;
        boolean sorted;
        int distance = (int) (array.length*1.247);
        int arraySize = array.length-1;

        while(true)
        {
            sorted=true;

            for (int i = 0; i < arraySize-distance; i++) {
                if(array[i]>array[i+distance])
                {
                    swap = array[i];
                    array[i] = array[i + distance];
                    array[i + distance] = swap;
                    sorted = false;
                }
            }
            distance--;

            if(sorted)
                break;
        }

        endTime = System.nanoTime();

        printArray("Comb Sort:", array);

        printTime(startTime, endTime);
    }

    public static void insertionSort(int []array)
    {
        long startTime = System.nanoTime();
        long endTime;
        int swap;
        int arraySize = array.length-1;

        for(int i=1; i<arraySize; i++)
        {
            int j = i;
            while((j>0)&&(array[j]<array[j-1]))
            {
                swap=array[j];
                array[j]=array[j-1];
                array[j-1]=swap;
                j--;
            }
        }

        endTime = System.nanoTime();

        printArray("Insertion Sort", array);

        printTime(startTime, endTime);
    }

    public static void selectionSort(int []array)
    {
        long startTime = System.nanoTime();
        long endTime;
        int swap;
        int min;
        int arraySize = array.length-1;

        for(int i = 0; i<arraySize-1; i++)
        {
            min=array[i];
            for (int j = i; j < arraySize; j++) {
                if(array[j]<array[min])
                {
                    min=j;
                }
            }
            swap=array[i];
            array[i]=array[min];
            array[min]=swap;
        }

        endTime = System.nanoTime();

        printArray("Selection Sort", array);

        printTime(startTime, endTime);
    }

    public static void quickSort( int []array, int low, int high)
    {
        long startTime = System.nanoTime();
        long endTime;
        int swap;

        int middle = low + (high - low) / 2;
        int pi = array[middle];

        if(low < high) {
            int i = low;
            int j = high;
            while (i <= j) {
                while (array[i] < pi) {
                    i++;
                }

                while (array[j] > pi) {
                    j--;
                }
                if (i <= j)
                {
                    swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                    i++;
                    j--;
                }
            }

            if (low < j)
                quickSort(array, low, j);

            if (high > i)
                quickSort(array, i, high);

        }

        endTime = System.nanoTime();

        printArray("Quick Sort", array);

        printTime(startTime, endTime);
    }

    private static void printArray(String name, int []array)
    {
        System.out.println("\n"+name);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static void printTime(long startTime, long endTime)
    {
        System.out.println("\nTime = " + (double)(endTime - startTime)/100000 + " sec");
    }

}
