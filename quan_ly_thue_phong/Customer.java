package quan_ly_thue_phong;

import java.util.Scanner;

public class Customer extends Person{
    private int rentalDay;
    private String categoryRoom;
    Room room = new Room();
    public Customer()
    {
    }

    public Customer(String passport, String name, byte age, int rentalDay, String categoryRoom) {
        super(passport, name, age);
        this.rentalDay = rentalDay;
        this.categoryRoom = categoryRoom;
    }

    public int getRentalDay() {
        return rentalDay;
    }

    public void setRentalDay(int rentalDay) {
        this.rentalDay = rentalDay;
    }

    public String getcategoryRoom() {
        return categoryRoom;
    }

    public void setcategoryRoom(String categoryRoom) {
        this.categoryRoom = categoryRoom;
    }

    @Override
    void getInfo() {
        super.getInfo();
        Scanner sc= new Scanner(System.in);
        System.out.print("Entrer your rantel day : ");
        rentalDay=Integer.parseInt(sc.nextLine());
        System.out.print("Entrer your category categoryRoom : ");
        this.setcategoryRoom(sc.nextLine());
    }
    @Override
    void showInfo() {
        super.showInfo();
        System.out.println("Rental day :"+rentalDay+"\nCategory categoryRoom :"+categoryRoom);
        System.out.println("Totel money :"+customerBill());
    }
    double customerBill()
    {
        return room.price(this.getcategoryRoom())*rentalDay;
    }
}
