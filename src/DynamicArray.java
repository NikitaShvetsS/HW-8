public class DynamicArray {
    private String[] array;
    private int size;

    public DynamicArray() {
        array = new String[10];
        size = 0;
    }

    public boolean add(int index, String value) {
        if (index < 0 || index > size) {
            return false;
        }

        if (size == array.length) {
            extendArray();
        }

        // Зсув елементів вправо
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        size++;
        return true;
    }

    public boolean add(String value) {
        return add(size, value);
    }

    public boolean delete(int index) {
        if (index < 0 || index >= size) {
            return false;
        }

        // Зсув елементів вліво
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
        return true;
    }

    public boolean delete(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    private void extendArray() {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }
}
