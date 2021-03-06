// FractionArr class, using a 2-element integer array as the data members

class FractionArr implements FractionI {

	/************** Data members **********************/
	private int[] members;

	/************** Constructors **********************/
	// Default constructor creates a fraction 1/1

	public FractionArr() {
		this(1, 1);
	}

	public FractionArr(int numer, int denom) {
		members = new int[2];
		setNumer(numer);
		setDenom(denom);
	}

	/**************** Accessors ***********************/
	public int getNumer() {
		return members[0];
	}

	public int getDenom() {
		return members[1];
	}

	/**************** Mutators ************************/
	public void setNumer(int numer) {
		this.members[0] = numer;  
	}

	public void setDenom(int denom) {
		this.members[1] = denom;  
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
	public FractionI simplify() {
		int numer = this.getNumer();
		int denom = this.getDenom();
		int gcd = gcd(Math.abs(numer), denom);

		return new FractionArr(numer/gcd, denom/gcd);
	}

	// Return this + f
	public FractionI add(FractionI f) {
		int numer = (this.getNumer() * f.getDenom()) +
		            (f.getNumer() * this.getDenom());
		int denom = this.getDenom() * f.getDenom();

		FractionI ans = new FractionArr(numer, denom);
		return ans.simplify();
	}

	// Return this - f
	public FractionI minus(FractionI f) {
		int numer = (this.getNumer() * f.getDenom()) -
		            (f.getNumer() * this.getDenom());
		int denom = this.getDenom() * f.getDenom();

		FractionI ans = new FractionArr(numer, denom);
		return ans.simplify();
	}

	// Return this * f
	public FractionI times(FractionI f) {
		int numer = this.getNumer() * f.getNumer();
		int denom = this.getDenom() * f.getDenom();

		FractionI ans = new FractionArr(numer, denom);
		return ans.simplify();
	}

	/***************** Overriding methods ******************/
	// Overriding toString() method
	public String toString() {
		return this.getNumer() + "/" + this.getDenom();
	}

	// Overriding equals() method
	public boolean equals(Object obj) {
		if (obj instanceof FractionI) {
			FractionI f1 = (FractionI) obj;
			f1 = f1.simplify();
			FractionI f2 = this.simplify();

			return f1.getNumer() == f2.getNumer() &&
				   f1.getDenom() == f2.getDenom();
		}
		else
			return false;
	}
}

