import java.util.*;

public class stack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int choice, temp;
        while(!exit){
            System.out.print("1. Add a value\n2. Display Values\n3. Edit values\n4. Delete\n0. Exit\nInput: ");
            choice = sc.nextInt();
            if(choice == 1){
                System.out.print("Enter a number: ");
                choice = sc.nextInt();
                st.push(choice);
            }
            else if(choice == 2){
                System.out.println(st);
            }
            else if(choice == 3){
                System.out.print("Select what number: ");
                try{
                    choice = sc.nextInt();
                    if(choice > st.size()){
                        throw new Exception();
                    }
                    else{
                        temp = choice;
                        System.out.print("Select what number do you want to add: ");
                        choice = sc.nextInt();
                        st.set(temp - 1, choice);
                    }
                }
                catch(Exception e){
                    System.out.println("Please try again!");
                }
            }
            else if(choice == 4){
                System.out.println("Select what number to delete: ");
                try{
                    choice = sc.nextInt();
                    if(choice > st.size()){
                        throw new Exception();
                    }
                    else{
                        st.remove(choice - 1);
                    }
                }
                catch(Exception e){
                    System.out.println("Please try again!");
                }
            }
            else if(choice == 0){
                System.out.println("Terminating Program");
                exit = true;
            }
            else{
                System.out.println("Please try again");
            }
        }
        sc.close();
    }
}