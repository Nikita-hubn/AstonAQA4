
public class Main{

    public static void sumArray(String[][] str) throws MyArraySizeExeption, MyArrayDataExeption {
        int sum = 0;
        for(int i = 0; i < str.length; i++){
            if(str.length != 4) throw new MyArraySizeExeption("Ошибка размера массива ");
            for(int j = 0; j < str[i].length; j++){
                if(str[i].length != 4) throw new MyArraySizeExeption("Ошибка размера массива ");
                try {
                    sum += Integer.parseInt(str[i][j]);
                }catch (NumberFormatException ex){
                    throw new MyArrayDataExeption(i, j);
                }
            }
        }
        System.out.println("сумма массива равна " + sum);
    }


    public static void main(String[] args) {
        String[][] example1 = new String[4][4];
        String[][] example2 = new String[4][4];
        String[][] example3 = new String[4][5];

        for (int i = 0; i < example1.length; i++) {
            for (int j = 0; j < example1[i].length; j++) {
                example1[i][j] = "1";
            }
        }
        for (int i = 0; i < example2.length; i++) {
            for (int j = 0; j < example2[i].length; j++) {
                if (i + j == 6) example2[i][j] = "a";
                else example2[i][j] = "2";
            }
        }
        for(int i = 0; i < example3.length; i++) {
            for (int j = 0; j < example3[i].length; j++) {
                example3[i][j] = "3";
            }
        }
        try{
            sumArray(example1);
        }catch (MyArraySizeExeption ex) {
            System.out.println(ex);
        } catch (MyArrayDataExeption ex) {
            System.out.println(ex);
        }
        try{
            sumArray(example2);
        }catch (MyArraySizeExeption ex) {
            System.out.println(ex);
        } catch (MyArrayDataExeption ex) {
            System.out.println(ex);
        }
        try{
            sumArray(example3);
        }catch (MyArraySizeExeption ex) {
            System.out.println(ex);
        } catch (MyArrayDataExeption ex) {
            System.out.println(ex);
        }
    }
}