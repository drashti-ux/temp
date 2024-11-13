import java.util.Scanner;
public class Practice {
 public static void main(String[] args) {
	 int num1,num2;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Number 1:");
	 num1 = sc.nextInt();
	 System.out.println("Enter Number 2:");
	 num2 = sc.nextInt();
	System.out.println("Before Swappping:");
	System.out.println("Num1 :"+num1+" Num2 :"+num2);
	//Swapping 
	num1= num1+num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	System.out.println("After Swappping:");
	System.out.println("Num1 :"+num1+" Num2 :"+num2);
 }
}
