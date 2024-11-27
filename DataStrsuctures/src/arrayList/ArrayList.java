package arrayList;

public class ArrayList {

    private String[] list;
    private int size;
    private int capacity;

    public ArrayList() {
        this.capacity = 5;
        this.list = new String[capacity];
        this.size = 0;
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.list = new String[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public void myAdd(int index, String item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (item == null) {
            throw new NullPointerException();
        }
        if (size >= capacity) {
            resize(size);
            for (int count = size; count > index; count--) {
                list[count] = list[count - 1];
            }
        }
        list[index] = item;
        size++;
    }

    private void resize(int newCapacity) {
        capacity = newCapacity;
        list = new String[newCapacity];
        size = 0;
    }


    public void myRemove(int index) {
        if (index >= 0 && index <= size) {
            for (int count = index; count < size - 1; count++) {
                list[count] = list[count + 1];
            }
            list[size - 1] = null;
            size--;
        } else {
            System.out.println("Invalid index");
        }
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return list[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
