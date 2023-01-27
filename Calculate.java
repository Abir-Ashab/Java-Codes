package MyPackage;

import java.util.Scanner;

public class Calculate {
		public static void main(String[] args) {
			Rational firstNum=new Rational(0, 0);//firstNum is an object
			Rational secondNum=new Rational(0, 0);	
			Rational result=new Rational(0,0);//3 ta rational type object nilam
	
			            Scanner in = new Scanner(System.in);
						System.out.println("enter 1st numerator:");
						firstNum.numerator=in.nextInt();//object er maddhome oi object jei class er ,oi class er var use korechhi
						System.out.println("enter 1st denominator:");
						firstNum.denominator=in.nextInt();
						System.out.println("enter 2nd numerator:");
						secondNum.numerator=in.nextInt();
						System.out.println("enter 1st denominator:");
						secondNum.denominator=in.nextInt();
			result=result.add(firstNum,secondNum);
			System.out.println("addition is : "+(double)result.numerator/result.denominator);
			
			result=result.sub(firstNum,secondNum);
			System.out.println("Substraction is : "+(double)result.numerator/result.denominator);
			
			result=result.multiply(firstNum,secondNum);
			System.out.println("Multiplication is : "+(double)result.numerator/result.denominator);
			
			result=result.divide(firstNum,secondNum);
			System.out.println("Division is : "+(double)result.numerator/result.denominator);
			
			System.out.print("final result of addition is:"+result.numerator);
			System.out.println( "/" +result.denominator);
			
			result=result.sub(firstNum,secondNum);
			System.out.print("final numerator of subtraction is:"+result.numerator);
			System.out.println("/" +result.denominator);
			
			
			result=result.multiply(firstNum,secondNum);
			System.out.print("final numerator of multiplication is:"+result.numerator);
			System.out.println("/" +result.denominator);
			
			
			result=result.divide(firstNum,secondNum);
			System.out.print("final numerator of division is:"+result.numerator);
			System.out.println("/" +result.denominator);
			
		}
	}
