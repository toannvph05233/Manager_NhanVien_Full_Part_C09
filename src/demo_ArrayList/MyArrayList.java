package demo_ArrayList;
public class MyArrayList<E> {
    int capacity = 10;
    int size = 0;
    Object[] numbers = new Object[capacity];


    public void add(E num) {
        if (size >= capacity) {
            copyArray();
        }
        numbers[size] = num;
        size++;
    }

    private void copyArray() {
        capacity = capacity * 2;
        Object[] newArr = new Object[capacity];
        for (int i = 0; i < numbers.length; i++) {
            newArr[i] = numbers[i];
        }
        numbers = newArr;
    }

    public int size(){
        return size;
    }

    public E get(int index){
        return (E) numbers[index];
    }
}



