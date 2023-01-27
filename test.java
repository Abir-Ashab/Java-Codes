package MyPackage;

	public class Rational {
		int numerator;
		int denominator;
		Rational(int num,int den){
			numerator=num;
			denominator=den;
		}
		
		
		public Rational add(Rational firstnum,Rational secondnum) {
			int numerator =firstnum.numerator*secondnum.denominator+secondnum.numerator*firstnum.denominator;
			int denominator = firstnum.denominator*secondnum.denominator;
			
			Rational rational = new Rational(numerator,denominator);
			return rational;
			}
		public Rational sub(Rational firstnum,Rational secondnum) {
			int numerator =firstnum.numerator*secondnum.denominator-secondnum.numerator*firstnum.denominator;
			int denominator = firstnum.denominator*secondnum.denominator;
			
			Rational rational = new Rational(numerator,denominator);
			return rational;
			}
		public Rational multiply(Rational firstnum,Rational secondnum) {
			int numerator =firstnum.numerator*secondnum.numerator;
			int denominator = firstnum.denominator*secondnum.denominator;
			
			Rational rational = new Rational(numerator,denominator);
			return rational;
			}
		public Rational divide(Rational firstnum,Rational secondnum) {
			int numerator =firstnum.numerator*secondnum.denominator;
			int denominator = firstnum.denominator*secondnum.numerator;
			
			Rational rational = new Rational(numerator,denominator);
			return rational;
			}
	}
