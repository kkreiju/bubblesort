public class bubblesort {
   public static void main(String[] args) {
      int[] randomizedset = { 16, 3, 29, 12, 37, 15, 15, 1 };
      int temp;
      boolean unsorted = true;

      System.out.print("Original: ");
      for (int i = 0; i < randomizedset.length; i++) {
         System.out.print(randomizedset[i] + " ");
      }

      System.out.println("\n");

      while (unsorted == true) {
         for (int i = 0; i < randomizedset.length; i++) {
            if (i != 0) {
               if (randomizedset[i] < randomizedset[i - 1] || randomizedset[i] == randomizedset[i-1]) {
                  temp = randomizedset[i - 1];
                  randomizedset[i - 1] = randomizedset[i]; 
                  randomizedset[i] = temp;
               }
            } else {
               if (randomizedset[i] > randomizedset[i + 1]) {
                  temp = randomizedset[i + 1];
                  randomizedset[i + 1] = randomizedset[i];
                  randomizedset[i] = temp;
               }
            }
            for (int j = 0; j < randomizedset.length; j++) {
               System.out.print(randomizedset[j] + " ");
            } 
            System.out.println();
         }
         System.out.println("\nAnother Pass.\n");
         for(int i = 1; i < randomizedset.length; i++){
            if(randomizedset[i] >= randomizedset[i - 1]){
               unsorted = false;
            }
            else{
               unsorted = true;
               i = randomizedset.length;
            }
         }

         
         
      }

      temp = 0;

      for (int i = 0; i < randomizedset.length; i++) {
         System.out.print(randomizedset[i] + " ");
      }
   }
}