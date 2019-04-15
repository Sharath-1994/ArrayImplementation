package arraylist;

//ArrayList for int implementation

public class MyArrayList implements List {

    private int arraySize;
    private int head;

    private Integer[] array;


    public MyArrayList(int size) {
        this.arraySize = size;
        this.head = -1;
        array = new Integer[arraySize]; // Adds new Array size to array
    }

    //Empty constructor which takes default value as 10 as arraySize
    public MyArrayList() {
        this.arraySize = 10;
        this.head = -1;
        array = new Integer[arraySize]; // adds default size which is 10
    }

    @Override
    public void add(int number) {
        if (head < array.length -1) {
            head++;
        } else {
            this.arraySize = arraySize + 2;
            addNewArray();
            head++;
        }
        array[head] = number;
        System.out.println(number + " added");

    }



    @Override
    public int remove(int index) {
        int holdRemovedValue = index;
        int indexValue = index;
        for(int i = index; i < array.length -1 ; i++){
            index++;
            array[i] = array[index];
        }
        return holdRemovedValue;
    }

    @Override
    public int size() {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void printElementInArray() {
        System.out.println("Index " + " values");
        for (int i = 0; i < array.length; i++) {
          //  if(array[i]!= null)
            System.out.println(i + "         " + array[i]);
        }
    }

    //Method to change the size of the array while adding
    private void addNewArray(){
        Integer newArray[] = new Integer[arraySize];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = new Integer[arraySize];

        for(int i = 0; i < newArray.length; i++){
            array[i] = newArray[i];
        }
    }

    public void length(){
        System.out.println(array.length);
    }


}
