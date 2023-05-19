public class DynamicArray {

    String[] array;
    int size;

    public DynamicArray(){
        array = new String[10];
        size = 0;
    }

    public String[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }
}
