import java.util.ArrayList;

public class BigInteger {
    private DigitList digits;
    private int sign;

    public BigInteger() {
        this.digits = null;
        this.sign = 1;
    }

    public BigInteger(DigitList L) {
        this.digits = L;
        this.sign = 1;
    }

    public BigInteger(int i, DigitList L) {
        this.digits = L;
        this.sign = sgn(i);
    }

    public BigInteger(int i) {
        this.digits = DigitList.digitize(Math.abs(i));
        this.sign = sgn(i);
    }

    public BigInteger(String str) {
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            this.digits = DigitList.digitize(str);
            this.sign = -1;
        } else {
            this.digits = DigitList.digitize(str);
            this.sign = 1;
        }
    }

    public DigitList getDigits() {
        return this.digits;
    }

    public int getSign() {
        return this.sign;
    }

    public void setDigits(DigitList digits) {
        this.digits = digits;
    }

    public void setSign(int sign) {
        this.sign = sign;
    }

    private int sgn(int i) {
        if (i < 0)
            return -1;
        else
            return 1;
    }

    public int length() {
        if (this.digits == null)
            return 0;
        else
            return this.digits.length();
    }

    public BigInteger copy() {
        if (this.digits == null)
            return new BigInteger(0);
        else
            return new BigInteger(this.sign, this.digits.copy());
    }

    public BigInteger trimDigit() {
        return new BigInteger(this.sign, DigitList.trimDigitList(this.digits));
    }

    public boolean equals(Object obj) {
        if (obj instanceof BigInteger) {
            BigInteger other = (BigInteger) obj;
            if (this.sign == other.sign && DigitList.compareDigitLists(this.digits, other.digits) == 0) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        if (this.digits != null) {
            String integer = "";
            DigitList tmp = this.digits;
            integer = tmp.getDigit() + integer;
            tmp = tmp.getNextDigit();
            while (tmp != null) {
                integer = tmp.getDigit() + integer;
                tmp = tmp.getNextDigit();
            }
            return ((this.sign == -1) ? "-" : "") + integer;
        } else
            return "";
    }
	
	public BigInteger leftDigits(int n) {
        return new BigInteger(this.digits.leftDigits(n));
    }

    public BigInteger rightDigits(int n) {
        return new BigInteger(this.digits.rightDigits(n));
    }

    public BigInteger shift(int n) {
		if (n < 1)
            return this;
        else {
            BigInteger clone = this.copy();
            clone.digits = new DigitList(0, clone.digits);
            return clone.shift(n - 1);
        }
    }

    /******************************** STUDENT'S CODE ********************************/

    public BigInteger add(BigInteger other) {
        // complete this code
        if (this.sign == other.sign)
            return new BigInteger(this.sign, DigitList.addDigitLists(0, this.digits, other.digits));
        else{
            int cmp = DigitList.compareDigitLists(this.digits, other.digits);
            if(cmp == 0){
                //this == other => ans = 0
                return new BigInteger(new DigitList(0,null));
            }
            else{
                if (cmp == -1){
                    //abs(this) < abs(other) => BigNumber is negative
                    return new BigInteger(other.sign, DigitList.trimDigitList(DigitList.subDigitLists(0, other.digits, this.digits)));
                }
                else{
                    // abs(this) > abs(other) => BigNumber is positive
                    return new BigInteger(this.sign, DigitList.trimDigitList(DigitList.subDigitLists(0, this.digits, other.digits)));
                }  
            }
        }
    }

    public BigInteger sub(BigInteger other) {
        if (this.sign != other.sign)
            return new BigInteger(this.sign, DigitList.addDigitLists(0, this.digits, other.digits));
        else{
            int cmp = DigitList.compareDigitLists(this.digits,other.digits);
            if (cmp == 0){
                // this = other => BigNumber is 0
                return new BigInteger(new DigitList(0,null));
            }
            else{    
                if (cmp == -1){
                    // abs(this) < abs(other) => BigNumber is negative
                    return new BigInteger(-this.sign, DigitList.trimDigitList(DigitList.subDigitLists(0, other.digits, this.digits)));
                }
                else{
                    // abs(this) > abs(other) => BigNumber is positive
                    return new BigInteger(this.sign, DigitList.trimDigitList(DigitList.subDigitLists(0, this.digits, other.digits)));
                }
            }
        }
    }    

    public BigInteger mul(BigInteger other) {
        if(this.length() < other.length())
            return new BigInteger(this.sign*other.sign,other.mul(this).getDigits());
        int n = this.length()/2;
        int tmp = this.length() - other.length();
        if(tmp > 0){
            DigitList otherList = other.getDigits();
            DigitList lastDigit = other.getDigits();
            while(lastDigit != null && lastDigit.getNextDigit() != null){
                lastDigit = lastDigit.getNextDigit();
            }
            for(int i = 1; i<=tmp;++i){
                lastDigit.setNextDigit(new DigitList());
                lastDigit = lastDigit.getNextDigit();
            }

        }
        if(this.length() >= 2){  //dung cong thuc tong quat de tinh

            BigInteger x_left = this.leftDigits(n);
            x_left.setSign(this.sign);
            BigInteger y_left = other.leftDigits(n);
            y_left.setSign(other.sign);
            BigInteger x_right = this.rightDigits(this.length() - n);
            x_right.setSign(this.sign);
            BigInteger y_right = other.rightDigits(other.length() - n);
            y_right.setSign(other.sign);

            // L1 = x_left * y_left
            BigInteger L1 = x_left.mul(y_left);
            L1.setSign(x_left.sign * y_left.sign);
            //L1.setSign(x_left.getSign() * y_left.getSign());
            
            // L2 = 10^n * (x_right * y_left + x_left * y_right)
            BigInteger xr_yl = x_right.mul(y_left);
            xr_yl.setSign(x_right.getSign() * y_left.getSign());
            BigInteger xl_yr = x_left.mul(y_right);
            xl_yr.setSign(x_left.getSign() * y_right.getSign());
            BigInteger L2 = xr_yl.add(xl_yr).shift(n);
            //L2.setSign(x_left.getSign() * y_left.getSign() + );

            BigInteger L3 = x_right.mul(y_right).shift(n*2);
            L3.setSign(x_right.sign * y_right.sign);
            BigInteger ans = L1.add(L2).add(L3);
            return new BigInteger(ans.sign,DigitList.trimDigitList(ans.getDigits()));
        }
        else{
            // nhan hai so truc tiep
            int L1 = this.getDigits().getDigit();
            int L2 = other.getDigits().getDigit();
            return new BigInteger(this.sign*other.sign, DigitList.trimDigitList(DigitList.digitize(L1*L2)));
        }
    }

    public static BigInteger pow(BigInteger X, BigInteger Y) {
        int d = 1;
        int p = Y.getDigits().getDigit();
        DigitList digitY = Y.getDigits();
        while(digitY != null && digitY.getNextDigit() != null){
            digitY = digitY.getNextDigit();
            d*=10;
            p += d * digitY.getDigit();      
        }
        BigInteger ans = X;
        for(int i = 1; i<p;++i){
            ans = ans.mul(X);
        }

        if(X.sign < 0){
            if(p % 2 == 0)
                ans.sign = 1;
            else   
                ans.sign = -1;
        }
        return ans;
    }

    public static BigInteger factorial(BigInteger X) {
        //System.out.println("Factorial\n");
        return new BigInteger();
    }

    public static BigInteger computeValue(ArrayList<BigInteger> operandArr, ArrayList<Character> operatorArr) {
		BigInteger output = operandArr.get(0);
        for (int j = 0; j < operatorArr.size(); j++) {
            switch (operatorArr.get(j)) {
                case '+':
                    output = output.add(operandArr.get(j + 1));
                    break;
                case '-':
                    output = output.sub(operandArr.get(j + 1));
                    break;
                case '*':
                    output = output.mul(operandArr.get(j + 1));
                    break;
                default:
                    break;
            }
        }
        return output;
    }
}