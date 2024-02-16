public class DeciOct {
    int n, oct;

    public DeciOct() {
        this.n = 0;
        this.oct = 0;
    }

    public void setNum(int nn) {
        this.n = nn;
    }

    public void show() {
        System.out.println("Decimal : " + this.n);
        deci_oct(); // Call the recursive method
        System.out.printf("Octal is %d", this.oct);
    }

    // Use recursion to convert decimal to octal
    public void deci_oct() {
        if(n<8) {
            this.oct = n;
        } else {
            int temp = n;
            n = n / 8;
            deci_oct();
            this.oct = this.oct * 10 + temp % 8;
        }
    }

    public static void main(String[] args) {
        DeciOct d = new DeciOct();
        d.setNum(16  );
        d.show();
    }
}
