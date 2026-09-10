public class onesinglearray{
   public static void main(String[] args) {
       int[] arr1 = {10,20,30};
       int[] arr2 = {40,50,60};

       int[] merged = new int[arr1.length + arr2.length];
       for (int i = 0; i < arr1.length; i++){
        merged[i] = arr1[i];
       }
        for (int i = 0; i < arr2.length; i++){
            merged[arr1.length +i] = arr2[i];
        }
        System.out.println("Merged Array");
        for (int i = 0; i < merged.length; i++){
            System.out.println(merged[i] + " ");
        }
    }
}