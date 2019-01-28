package OopsPackage;

public class TimeAdd {
    int hours;
    int minutes;
    void getData(int h,int m)
    {
        hours=h;
        minutes=m;
    }
    void putTime()
    {
        System.out.println("The time you entered is " + hours +" hours " +" and " +minutes+" minutes");
    }
    void add(TimeAdd t1,TimeAdd t2)
    {
        int newMinutes=t1.minutes+t2.minutes;
        int netMinutes=0;
        if(newMinutes>60)
        {
            netMinutes=newMinutes%60;
        }
        int newHours=newMinutes/60;
        this.minutes=netMinutes;
        this.hours=newHours+t1.hours+t2.hours;
    }
}
class TimeUse
{
    public static void main(String[] args) {
        TimeAdd t1=new TimeAdd();
        t1.getData(5,45);
        t1.putTime();
        TimeAdd t2=new TimeAdd();
        t2.getData(5,30);
        t2.putTime();;
        TimeAdd t3=new TimeAdd();
        t3.add(t1,t2);
        t3.putTime();
    }
}
