import java.util.StringJoiner;

public class HWtoChapter8 {
    public static void main(String[] args) {
        String [ ] arr1 = {"Anne","John", "Alex", "Jessica"};
        String [ ] arr2 = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"}; 
        String [ ] ResultantArr = newArr(arr1);


    }


    public static String [] newArr(String[]arr){
         for (int i = 0 , j = arr.length - 1; i < j; i++,j--) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }

         System.out.print("{");

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String result1 = new StringBuilder(s).reverse().toString();
            String result2 =  result1.toLowerCase();
            String result3 = result2.substring(0, 1).toUpperCase()+result2.substring(1);
      
            if (i < arr.length - 1) {
                System.out.print(result3 + ","); 
              } else {
                System.out.print(result3);
              }
         } 
         
         System.out.println("}");
         
        return arr ;

    }



}
