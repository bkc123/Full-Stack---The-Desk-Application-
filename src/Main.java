import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer> expenses = new ArrayList<Integer>();
    public static void main(String[] args) {
        expenses.add(1000);
        expenses.add(2300);
        expenses.add(45000);
        expenses.add(32000);
        expenses.add(110);
        /*System.out.println("Hello World!");*/
        System.out.println("\n**************************************\n");
        System.out.println("\tWelcome to TheDesk \n");
        System.out.println("**************************************");
        optionsSelection();

    }
    private static void optionsSelection() {
        String[] option = {"1. I wish to review my expenditure",
                "2. I wish to add my expenditure",
                "3. I wish to delete my expenditure",
                "4. I wish to sort the expenditures",
                "5. I wish to search for a particular expenditure",
                "6. Close the application"
        };

        for(String eachOption: option){
            System.out.println(eachOption);
            // display the all the Strings mentioned in the String array
        }
        System.out.print("\nEnter your choice:\t");
        Scanner sc = new Scanner(System.in);
        int  options =  sc.nextInt();
        switch (options){
                    case 1:
                        System.out.println("Your saved expenses are listed below: \n");
                        System.out.println(expenses+"\n");
                        optionsSelection();
                        break;
                    case 2:
                        System.out.println("Enter the value to add your Expense: \n");
                        int value = sc.nextInt();
                        expenses.add(value);
                        System.out.println("Your value is updated\n");
                        System.out.println(expenses+"\n");
                        optionsSelection();

                        break;
                    case 3:
                        System.out.println("You are about the delete your expenses! \nMake a selection for type of delete you want to make...\n");
                        System.out.print("a. I wish to delete all my expenditure. \nb. I wish to delete the specific entry of my expenses:\t");
                        //Scanner sc = new Scanner(System.in);
                        String  deleteOption =  sc.next();
                        switch(deleteOption) {
                            case "a":
                                expenses.clear();
                                System.out.println(expenses + "\n");
                                System.out.println("All your expenses are erased!\n");
                                optionsSelection();
                                break;
                            case "b":
                                System.out.println("Enter the expense you want to delete:\t");
                                int deleteItem = sc.nextInt();
                                //boolean bk = true;
                                /* int i = expenses.indexOf(deleteItem);
                                expenses.remove(i);
                                */
                                   for (int i = 0; i < expenses.size(); i++) {
                                       if (deleteItem == expenses.get(i)) {
                                           expenses.remove(i);
                                           System.out.println(expenses + "\n");
                                           System.out.println("requested expense has been deleted and expenses is updated!\n");
                                           System.out.println("Please choose a option of your choice from the following: ");
                                           optionsSelection();
                                           break;
                                       }
                                   }


                                System.out.println("Sorry,the expens you requested to delete doesn't exit in the expenses list");
                                System.out.println(expenses + "\n");
                                System.out.println("Please choose a option of your choice from the following: ");
                                optionsSelection();
                                break;
                        }
                    case 4:
                        sortExpenses(expenses);
                        optionsSelection();
                        break;
                    case 5:
                        System.out.println("Enter the expense you want to search:\t");
                        int x= sc.nextInt();
                        searchExpenses(expenses,x);
                       // optionsSelection();
                        // break;
                    case 6:
                        closeApp();
                        break;
                    default:
                        System.out.println("You have made an invalid choice!");
                        break;
                }
            }

    private static void closeApp() {
        System.out.println("Closing your application... \nThank you!");
        System.exit(0);
            }
    private static void searchExpenses(ArrayList<Integer> arrayList, Integer x) {
        //int leng = arrayList.size();
       //  System.out.println("Enter the expense you need to search:\t");
        //Complete the method
        /* #####################
      boolean foundResult = false;
        for (int expense : arrayList) {
            if (expense == x) {
                foundResult = true;
            }
        }
        if (foundResult) {
            System.out.println("Found expense " + x);
        } else {
            System.out.println("Did not find expense " + x);
        }
        ############################*/
        for (int i = 0; i <arrayList.size(); i++){
            if (x.equals(arrayList.get(i))){
                System.out.println( x + " was found in index "+ arrayList.indexOf(x));
                System.out.println(arrayList + "\n");
                System.out.println("Please choose a option of your choice from the following: ");
                optionsSelection();
            }
        }
        System.out.println("Sorry,the expens you requested to search doesn't exit in the list");
        System.out.println(arrayList + "\n");
        System.out.println("Please choose a option of your choice from the following: ");
        optionsSelection();
    }
    private static void sortExpenses(ArrayList<Integer> arrayList) {
        int arrlength =  arrayList.size();
       //Complete the method. The expenses should be sorted in ascending order.
        Collections.sort(arrayList);
        System.out.println("Expenses in Order: " );
        System.out.println( arrayList + "\n");
    }
}
