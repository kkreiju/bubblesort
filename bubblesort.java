import javax.swing.*;

public class bubblesort {
   public static void main(String[] args) {
      JLabel result = new JLabel("", 0);

      int[] randomizedset = { 4, 3, 2, 1 };
      int temp;
      boolean unsorted = true;
      String sorted = "";

      System.out.print("Original: ");
      for (int i = 0; i < randomizedset.length; i++) {
         System.out.print(randomizedset[i] + " ");
      }

      System.out.println("\n");

      while (unsorted == true) {
         for (int i = 0; i < randomizedset.length; i++) {
            if (i != 0) {
               if (randomizedset[i] <= randomizedset[i - 1]){
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
         String sortemp = sorted + randomizedset[i];
         sorted = sortemp + " ";
      }

      JFrame window = new JFrame("Bubble Sort Result");
      window.setSize(300, 150);
      window.setVisible(true);
      window.setLocationRelativeTo(null);
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      result.setText(sorted);
      window.add(result);
   }
}