import java.util.Scanner;
class Booking implements I_Booking {

    private String user;
    private String pass;
    private String name;
    private String id;
    private String departmentName;
    private String medHistory;
    private String phoneNum;
    private String date;
    private String timeBooking;
    private int time;
    private int department;
    

   // Constructor
    public Booking() {
        System.out.println("                                         HOSPITAL LOG-IN");
    }
    // เข้าสู่ระบบ
    @Override
    public void login() {
        boolean status = true;
        while (status) {
            System.out.print("\nID card number to login : ");
            this.user = new Scanner(System.in).nextLine();
            if (this.user.length() == 13 ) 
            {
                System.out.print("Password : ");
                this.pass = new Scanner(System.in).nextLine();
                break;
            } 
            else  
            {
                System.out.println("Plese input ID card number again !\n");
            }
        }
    }
     // รับค่าชื่อนามสกุล
    public void enterName() {
         System.out.println("\n                                    --- Hello and Welcome ---"    );
         System.out.println("                                     Hospital reservation system \n");
         System.out.println("*** Please input the information and provide options. ***");
         System.out.print("\nPlease input name/surname : ");
            this.name = new Scanner(System.in).nextLine();
    }
    // รับค่าเลขบัตร
    public void enterID() {
        boolean status = true;
        while (status) {
            System.out.print("Please input ID card number: ");
            this.id = new Scanner(System.in).nextLine();
            if (this.id.length() == 13&&this.id.equals(this.user))
            {
                break;
            } else {
                System.out.println("Please input ID card number again!");
            }
        }
    }
    // รับค่าแผนก
    public void enterDepartment() {
        boolean status = true;
        while (status) {
            System.out.print("\n         * DEPARTMENT *\n");
            System.out.print("DEPARTMENT 1 (MED) MEDICINE \n"); //อายุรกรรม
            System.out.print("DEPARTMENT 2 (PED) PEDIATRIC \n"); //กุมารเวชกรรม
            System.out.print("DEPARTMENT 3 (SUR) SURGICAL \n"); //ศัลยกรรม
            System.out.print("DEPARTMENT 4 (ORTHO) ORTHOPEDIC \n"); //ศัลกระดูก
            System.out.print("DEPARTMENT 5 (OB-GYN) OBSTRETIC GYNECOLOGY \n"); //สูติ
            System.out.print("\nPlease select a department (1-5) : ");
            this.department = new Scanner(System.in).nextInt();
            switch (this.department) {
                case 1:
                    status = false;
                    this.departmentName = "MEDICINE DEPARTMENT";
                    break;
                case 2:
                    status = false;
                    this.departmentName = "PEDIATRIC DEPARTMENT";
                    break;
                case 3:
                    status = false;
                    this.departmentName = "SURGICAL DEPARTMENT";
                    break;
                case 4:
                    status = false;
                    this.departmentName = "ORTHOPEDIC DEPARTMENT";
                    break;
                case 5:
                    status = false;
                    this.departmentName = "OBSTRETIC GYNECOLOGY DEPARTMENT";
                    break;
                default:
                    System.out.println("Please input department again!");
            }
        }
    }
    
    public void enterDateandTime(){
        System.out.print("Date Booking (DD/MM/YY): ");
            this.date = new Scanner(System.in).nextLine();
    boolean status = true;
        while (status) {
            System.out.print("\n         * TIME *\n");
            System.out.print("9 O'clock \n"); 
            System.out.print("10 O'clock \n"); 
            System.out.print("11 O'clock \n"); 
            System.out.print("13 O'clock \n"); 
            System.out.print("14 O'clock \n"); 
            System.out.print("15 O'clock \n"); 
        System.out.print("Please select time for booking. (9-15 O'clock except 12 O'clock because it is during lunch time) : ");
            this.time = new Scanner(System.in).nextInt();
            switch (this.time) {
                case 9  :
                    status = false;
                    this.timeBooking = "9:00";
                    break;
                case 10:
                    status = false;
                    this.timeBooking = "10:00";
                    break;
                case 11:
                    status = false;
                    this.timeBooking = "11:00";
                    break;
                case 13:
                    status = false;
                    this.timeBooking = "13:00";
                    break;
                case 14:
                    status = false;
                    this.timeBooking = "14:00";
                    break;
                case 15:
                    status = false;
                    this.timeBooking = "15:00";
                    break;
                default:
                    System.out.println("Please input time again!");
            }

        }
    }
    
    //ข้อมูล
    public void enterInfo(){
        boolean status = true;
        while (status) {
        System.out.print("Please input your phone number : ");
            this.phoneNum = new Scanner(System.in).nextLine();
            if (this.phoneNum.length() == 10) 
            {
                break;
            } else  
            {
                System.out.println("Please input phone number again!");
            }
        }
        System.out.print("Please input Drug allergy and Congenital disease. If not provided(-): "); 
            this.medHistory = new Scanner(System.in).nextLine();
    }
   
    //ผลลัพธ์การจอง
    public void getResult() {
        System.out.println("_____________________________________________________________________________________________");
        System.out.println("                                  YOUR BOOKING HAS BEEN CONFIRMED.                            ");
        System.out.println("                                             My Booking.            \n                        ");
        System.out.println("Name-Surname : " + this.name);
        System.out.println("ID card number : " + this.id);
        System.out.println("Department : " + this.department + " " + this.departmentName);
        System.out.println("Phone number : " + this.phoneNum);
        System.out.println("Drug allergy and Congenital disease : " + this.medHistory);
        System.out.println("DateandTimeBooking : " + this.date +" "+ this.timeBooking);
    }
    
}