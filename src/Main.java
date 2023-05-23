public class Main {
    public static void main(String[] args) {

        DynamicArray dArray = new DynamicArray();
        dArray.add("Array");
        dArray.add("Task");
        System.out.println(dArray.get(0));
        System.out.println(dArray.get(1));
        dArray.delete("Array");
        System.out.println(dArray.get(0));
    }
}
