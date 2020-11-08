//written by P.T.K.Trung

public class Fraction{
	private int numer;
	private int denom;
	public Fraction() {
		this(1, 1);
	}

	public Fraction(int numer, int denom) {
		setNumer(numer);
		setDenom(denom);
	}

	/**************** Accessors ***********************/
	public int getNumer() {
		return numer;   
	}

	public int getDenom() {
		return denom;  
	}

	/**************** Mutators ************************/
	public void setNumer(int numer) {
		this.numer = numer;  
	}

	public void setDenom(int denom) {
		this.denom = denom;  
	}

	public void setElement(Fraction f){
		setDenom(f.getDenom());
		setNumer(f.getNumer());
	}
	/***************** Other methods ******************/
	// Returns greatest common divisor of a and b
	// private method as this is not accessible to clients
	private static int gcd(int a, int b) {
		int rem;
		while (b > 0) {
			rem = a%b;
			a = b;
			b = rem;
		}
		return a;
	}

	// Returns simplified fraction
	public Fraction simplify() {
		int numer = this.getNumer();
		int denom = this.getDenom();
		int gcd = gcd(Math.abs(numer), denom);

		return new Fraction(numer/gcd, denom/gcd);
	}

	// Return this + f
	public Fraction add(Fraction f) {
		int numer = (this.getNumer() * f.getDenom()) +
		            (f.getNumer() * this.getDenom());
		int denom = this.getDenom() * f.getDenom();

		Fraction ans = new Fraction(numer, denom);
		return ans.simplify();
	}

	// Return this - f
	public Fraction minus(Fraction f) {
		int numer = (this.getNumer() * f.getDenom()) -
		            (f.getNumer() * this.getDenom());
		int denom = this.getDenom() * f.getDenom();

		Fraction ans = new Fraction(numer, denom);
		return ans.simplify();
	}

	// Return this * f
	public Fraction times(Fraction f) {
		int numer = this.getNumer() * f.getNumer();
		int denom = this.getDenom() * f.getDenom();

		Fraction ans = new Fraction(numer, denom);
		return ans.simplify();
	}

	/***************** Overriding methods ******************/
	// Overriding toString() method
	public String toString() {
		return this.getNumer() + "/" + this.getDenom();
	}

	// Overriding equals() method
	public boolean equals(Object obj) {
		if (obj instanceof Fraction) {
			Fraction f1 = (Fraction) obj;
			f1 = f1.simplify();
			Fraction f2 = this.simplify();

			return f1.getNumer() == f2.getNumer() &&
				   f1.getDenom() == f2.getDenom();
		}
		else
			return false;
	}

	public float getElement(){
		return (float) this.denom/this.numer;
	}
}

