package luyen_code;

import java.util.Scanner;

public class Luyen_Code {
    Scanner sc = new Scanner(System.in);
    int number ;
    int VL05(){
        int sum = 0;
        System.out.print("Enter number : ");
        number=sc.nextInt();
        if(number < 2)
            number=2;
        for (int i = 1; i <= number; i++) {
            if(i % 2 != 0)
                sum+=i;
            else
                sum-=i;
        }
        return sum;
    }
    float VL04()
    {
        float sum = 0;
        System.out.print("Enter number : ");
        number=sc.nextInt();
        if(number < 2)
            number=2;
        for (int i = 2; i <= number; i++) {
                sum += (float) 1/i;
        }
        return sum;
    }
    long GT1()
    {
        long result =1;
        System.out.print("Enter number : ");
        number=sc.nextInt();
        if(number < 2)
            number=2;
        for (int i = 1; i <= number; i++) {
            result *=i;
        }
        return result;
    }
    long GT(int x)
    {
        long result =1;
        for (int i = 1; i <= x; i++) {
            result *=i;
        }
        return result;
    }
    long VL07()
    {
        System.out.print("Enter two number : ");
        byte number1 = sc.nextByte();
        byte number2 = sc.nextByte();
        return GT(number1)/(GT(number2)*GT(number1-number2));
    }
    long VL09()
    {
        System.out.print("Enter two number : ");
        byte x = sc.nextByte();
        byte n = sc.nextByte();
        long result = 0;
        if(n > 10 || n <= 0)
            n= 2;
        for (int i = 1; i <= n; i++)
            result += (long) Math.pow(x,i)/ (1*i);
        return result;
    }
    int VL10()
    {
        int count = 0;
        System.out.print("Enter two number : ");
        number=sc.nextInt();
        Math.abs(number);
        while(number > 0)
        {
            number /= 10;
            count ++;
        }
        return count;
    }
}
class main{
    public static void main(String[] args) {
        Luyen_Code run = new Luyen_Code();
        System.out.println(run.VL10());
    }
}
