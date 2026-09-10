public class particularnumber  {
      public static void main(String[] args) {
          int[] arr = {10,20,10,30,10,40};
          int number = 19;
          int count = 0;
          for (int i = 0; i < arr.length; i++){
            if (arr[i] == number) {
                count++;
            }

            
          }
          System.out.println(number + " occurs " + count + "times");
      }
}
