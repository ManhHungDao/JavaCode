package quanilicanbo;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private byte level;
    public CongNhan()
    {

    }
    public CongNhan(String name, int age, String gender, String address, byte level) {
        super(name, age, gender, address);
        this.level = level;
    }

    @Override
    protected void inPut() {
        super.inPut();
        Scanner sc = new Scanner(System.in);
        System.out.print("Level : ");
        this.setLevel(sc.nextByte());
    }

    @Override
    protected void outPut() {
        super.outPut();
        System.out.println("Level : "+level);
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        if(level >=0 || level < 10)
            this.level = level;
        else
            this.level = 0;
    }
}
