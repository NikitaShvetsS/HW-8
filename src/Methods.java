public class Methods {

    public boolean add(DynamicArray dArray, int index, String value) {
        String[] array = dArray.getArray();
        int size = dArray.getSize();

        if (index < 0 || index > size) {
            return false;
        }

        if (size == array.length) {
            extendArray(dArray);
        }

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }

        array[index] = value;
        dArray.size++;
        return true;
    }

    public boolean add(DynamicArray dArray, String value) {
        return add(dArray, dArray.getSize(), value);
    }

    public boolean delete(DynamicArray dArray, int index) {
        String[] array = dArray.getArray();
        int size = dArray.getSize();

        if (index < 0 || index >= size) {
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        dArray.size--;
        return true;
    }

    public boolean delete(DynamicArray dArray, String value) {
        String[] array = dArray.getArray();
        int size = dArray.getSize();

        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return delete(dArray, i);
            }
        }
        return false;
    }

    public String get(DynamicArray dArray, int index) {
        String[] array = dArray.getArray();
        int size = dArray.getSize();

        if (index < 0 || index >= size) {
            return null;
        }
        return array[index];
    }

    private void extendArray(DynamicArray dArray) {
        String[] array = dArray.getArray();
        int size = dArray.getSize();

        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        dArray.array = newArray;
    }

}
