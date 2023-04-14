import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class CafeUtil {
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
   

public double getOrderTotal(double[] prices) {
  double sum = 0;
  for (int i = 0; i < prices.length; i++) {
    sum += prices[i];
  }
  return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter customer name: ");
        String name = input.nextLine();
        customers.add(name);
        System.out.println("Customer added: " + name);
    }

}
 