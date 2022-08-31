public class Main {

    public static void main(String[] args) {
       Integer[] value=new Integer[]{3,4};
       changeValue(value);
        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }


    }

    public static Integer[] changeValue(Integer[] value) {
        value[0]=99;
         return value;
    }
}