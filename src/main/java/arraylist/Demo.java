package arraylist;



public class Demo {

    public static void main(String[] args) {

        MyArrayList array = new MyArrayList(2);
        array.add(1);
        array.add(3);
        array.add(5);
        array.add(7);
        array.add(10);

        array.printElementInArray();

        array.length();
        array.remove(1);

        array.remove(1);

        array.printElementInArray();




    }
}
