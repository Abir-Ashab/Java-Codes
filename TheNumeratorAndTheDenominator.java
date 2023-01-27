package MyPackage;

public class TheNumeratorAndTheDenominator {
	   	       
	public class Calculate {
		public static void main(String[] args) {
			Rational firstNum=new Rational(1,2);
			Rational secondNum=new Rational(1,3);
			
			
			Rational result=new Rational(0,0);
			result=result.add(firstnum,secondnum);
			System.out.println("Summation is : "+(double)result.numerator/result.denominator);
			
			result=result.sub(firstnum,secondnum);
			System.out.println("Substraction is : "+(double)result.numerator/result.denominator);
			
			result=result.multiply(firstnum,secondnum);
			System.out.println("Multiplication is : "+(double)result.numerator/result.denominator);
			
			result=result.divide(firstnum,secondnum);
			System.out.println("Division is : "+(double)result.numerator/result.denominator);
			
		}
	}
	}
