
package inversive.cong.generator;
import java.util.Scanner;
public class InversiveCongGenerator {             //Inversive Cong.Generator Taking 3 inputs from user (initial value& Multiplier& Modulus)
 void getData(Scanner input){                  
  System.out.print("Enter Your Initial Value");   
  float X0=input.nextInt(); //Taking Initial Value (X0) From User
  System.out.print("Enter Your Multiplier Value"); 
  float a=input.nextInt();   //Taking Multiplier  Value (a) From User
  System.out.print("Enter Your Modulus Value");
  float m=input.nextInt();      //Taking Modulus  Value (m) From User
float x1 ,x2 ,x3 ,x4;
float R1 ,R2 ,R3 ,R4;
//First Values (X1,R1)
x1=(a/X0);
if(x1>m){     
x1=x1-m;
R1=(x1/m);
System.out.println("X1 Equals:" + x1);
System.out.println("Random Number 1 Equals" + R1);
}
else{
 R1=(x1/m);
System.out.println("X1 Equals:" + x1);
System.out.println("Random Number 1 Equals:" +R1);
}
System.out.println("//////////////////");
//Second Values (X2,R2)
x2=(a/x1);
if(x2>m){
x2=x2-m;
R2=(x2/m);
System.out.println("X2 Equals:"+x2);
System.out.println("Random Number 2 Equals:" +R2);
}
else{
R2=(x2/m);
System.out.println("X2 Equals :"+x2);
System.out.println("Random Number 2 Equals:" +R2);
}
System.out.println("//////////////////");
//Third Values (X3,R3)
x3=(a/x2);
if(x3>m){
x3=x3-m;
R3=x3/m;
System.out.println("X3 Equals:"+x3);
System.out.println("Random Number 3 Equals:"+R3);
}
else{
R3=x3/m;
System.out.println("X3 Equals:"+x3);
System.out.println("Random Number 3 Equals:"+R3);
}
System.out.println("//////////////////");
//Fourth Values (X4,R4)
x4=(a/x3);
if(x4>m){
x4=x4-m;
R4=x4/m;
System.out.println("X4 Equals:"+x4);
System.out.println("Random Number 4 Equals:"+R4);
}
else{
 R4=x4/m;
 System.out.println("X4 Equals:"+x4);
 System.out.println("Random Number 4 Equals:"+R4);
 }
 } 

    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
  InversiveCongGenerator obj = new InversiveCongGenerator();
  obj.getData(input); 
    }
    
}
