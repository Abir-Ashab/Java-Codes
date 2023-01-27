package MyPackage;

	public class Rational {
		int numerator;
		int denominator;
		Rational(int x,int y){//constructor
			numerator=x;//0 assign hobe
			denominator=y;//0 assign hobe
		}
		Rational add(Rational v1,Rational v2) {
			int numerator =v1.numerator * v2.denominator + v2.numerator * v1.denominator;
			int denominator = v1.denominator * v2.denominator;
			
			Rational rational = new Rational(numerator,denominator);//er fole rational method er access eshe porechhe Rational er numerator and denominator e
			this.numerator=numerator;
			this.denominator=denominator;
			return rational;
			}
		Rational sub(Rational v1,Rational v2) {
			int numerator =v1.numerator * v2.denominator - v2.numerator * v1.denominator;
			int denominator = v1.denominator * v2.denominator;
			
			Rational rational = new Rational(numerator,denominator);
			this.numerator=numerator;
			this.denominator=denominator;
			return rational;
			}
		Rational multiply(Rational v1,Rational v2) {
			int numerator =v1.numerator*v2.numerator;
			int denominator = v1.denominator*v2.denominator;
			
			Rational rational =  new Rational(numerator,denominator);
			this.numerator=numerator;
			this.denominator=denominator;
			return rational;
			}
		Rational divide(Rational v1,Rational v2) {
			int numerator =v1.numerator*v2.denominator;
			int denominator = v1.denominator*v2.numerator;
			
			Rational rational =  new Rational(numerator,denominator);
			this.numerator=numerator;
			this.denominator=denominator;
			return rational;
			}
	}