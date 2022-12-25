package even_odd_average_sum;
import javax.swing.JOptionPane;

public class Even_Odd_Average_Sum{
public static void main(String[] args) {
int num =0, even=2, sum = 0, product=1, evenSum = 0,evenCount=0,ave =0;
num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number : "));
//JOptionPane.showMessageDialog(null, "Choose Transactions: \n [1] Product of Even Numbers from 1 to given number  \n [2] Sum of odd number from 1 to num using do while loop \n [3] Average of even number using for loop" );
String trans = JOptionPane.showInputDialog(null, "Choose Transactions: \n [1] Product of Even Numbers from 1 to given number  \n [2] Sum of odd number from 1 to num using do while loop \n [3] Average of even number using for loop \n\n Enter the number you choose [1-3].");
int trans1 = Integer.parseInt(trans);
switch(trans1){
case 1: 
//for (int i=1; i<=num; i++) {
    while(even<num){
//if (i%2==0){
//product*=i;
product = product * even; 
        even += 2;
//}

}
JOptionPane.showMessageDialog(null, "Product of even numbers from 1 to "+num+" using while loop " + product );
break;

case 2:
int j = 1;
do{
if(j%2 != 0)
sum +=j;
j++;
}while(j <= num);
JOptionPane.showMessageDialog(null, "Sum of odd number from 1 to "+num+" using do while loop " +sum);
// if(i%2 != 0)
// sum +=i;
// i++;
break;

case 3:
for (int i=1; i<=num; i++) {
if (i%2==0)
evenSum = evenSum+i;
evenCount++;
ave = evenSum/evenCount;
}
JOptionPane.showMessageDialog(null, "Average of even numbers using for loop " + ave);
}
}
}