public class MyExceptions {
    public static Integer getSum(Object[][] array) throws MyArraySizeExeption, MyArrayDataException {
        int sum = 0;
        if (array.length != 4) {
            throw new MyArraySizeExeption("Некорректный размер массива");
        }

        for (int i = 0; i < array.length; i++) {
           if (array[i].length!=4){
               throw new MyArraySizeExeption("Некорректный размер массива");
           }
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] instanceof Integer) {
                    sum = sum + (Integer) array[i][j];
                }
                else {
                    throw new MyArrayDataException("Некорректные данные в ячейке " + (i) + ", " + j);
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Object[][] array1 = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        Object[][] array2 = {{1, 2, 3, 7}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        Object[][] array3 = {{1, 2, "t", "e"}, {1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
        try {
           System.out.println(getSum(array1));
        } catch (MyArraySizeExeption|MyArrayDataException exception) {
            System.err.println(exception.getMessage());
        }
        try {
           System.out.println(getSum(array2));
        } catch (MyArraySizeExeption|MyArrayDataException exception) {
            System.err.println(exception.getMessage());
        }
        try {
            System.out.println(getSum(array3));
        } catch (MyArraySizeExeption|MyArrayDataException exception) {
            System.err.println(exception.getMessage());
        }
    }
}