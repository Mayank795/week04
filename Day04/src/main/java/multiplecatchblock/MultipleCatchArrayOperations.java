package multiplecatchblock;

public class MultipleCatchArrayOperations {
    public static void retrieveValue(Integer[] array, int index) {
            try {
                if (array == null) {
                    throw new NullPointerException();
                }
                System.out.println("Value at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
        }
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        int index = 3;
        retrieveValue(array, index);
    }
}
