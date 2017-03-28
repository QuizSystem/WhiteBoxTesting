package whiteboxtesting;

public class WhiteBoxTesting {

    public static void main(String[] args) {
        System.out.println("Init Project learn White Box Testing");
    }
    
    float foo(int a, int b, int c, int d) {
        float e;
        if (a==0)
            return 0;
        int x = 0;
        if (((a==b) || (c==d)) && bug(a))
            x = 1;
        e = 1/x;
        return 0;
    }

    private boolean bug(int a) {
        return true;
    }
    
}
