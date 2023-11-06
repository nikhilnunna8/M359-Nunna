package MarvelEx;

public class APLine {
    private int a = 0;
    private int b = 0;
    private int c = 0;
    public APLine(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSlope(){
        double out = (double)a/b;
        out*=-1;
        return out;
    }
    public boolean isOnLine(int x, int y){
        int out = a * x;
        out += b*y;
        out+=c;
        if(out == 0){
            return true;
        }
        return false;
    }
}

