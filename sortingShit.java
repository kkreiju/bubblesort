class sortingShit{
   public static void main(String[] args){
     
      int[] numSort = {20, 12, 10, 15, 2, 1, 1, 3, 2};
         
         int num = numSort.length;
         int temp;

//bubble sort
/* 
         for(int i = 0; i <= num; i++)
         {
            for(int j = 0; j < num - 1; j++)
            {
               if(numSort[j] > numSort[j + 1])
               {      
                  temp = numSort[j];
                  numSort[j] = numSort[j + 1];
                  numSort[j + 1] = temp;
               }                
           }
       }
*/

//selection sort
      for(int i = 0 ; i < num - 1 ; i++){
         int minimum = i;
         for(int j = i + 1; j < num; j++){
            if(numSort[minimum] > numSort[j]){
               minimum = j;
            }
         }
         temp = numSort[minimum];
         numSort[minimum] = numSort[i];
         numSort[i] = temp;
      }

      System.out.print("Sorted Numbers: ");
         for(int k = 0; k < num; k++)
         {
            System.out.print(numSort[k] + " ");
         }  
      
   }
}