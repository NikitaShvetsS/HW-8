public class Main {
    public static void main(String[] args) {

        DynamicArray array = new DynamicArray();
        Methods arrayMethods = new Methods();
        arrayMethods.add(array, "Array");
        arrayMethods.add(array, "Task");
        System.out.println(arrayMethods.get(array, 0));
        System.out.println(arrayMethods.get(array, 1));
        arrayMethods.delete(array, "Array");
        System.out.println(arrayMethods.get(array, 0));

    }
}