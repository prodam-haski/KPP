package danya;

public class Information {
    private int m1;
    private int m2;
    private int v1;
    private int v2;


    public Information(int m1, int m2, int v1, int v2) {
        this.m1 = m1;
        this.m2 = m2;
        this.v1 = v1;
        this.v2 = v2;
    }

    public void setM1(int value){m1=value;}
    public void setM2(int value){m2=value;}
    public void setV1(int value){v1=value;}
    public void setV2(int value){v2=value;}

    public int getM1(){return m1;}
    public int getM2(){return m2;}
    public int getV1(){return v1;}
    public int getV2(){return v2;}

    public int getResult(){return (m1*v1+m2*v2)/(m1+m2);}
}
