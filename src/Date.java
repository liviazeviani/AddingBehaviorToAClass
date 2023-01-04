public class Date {

    private int day;
    private int month;
    private int year;

    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public static boolean isLeapYear(int year){
        return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400 ) ==0 );
    }

    public static int daysInMonth(int month, int year){
        int returnValue;
        switch(month) {
            case 9:
            case 4:
            case 6:
            case 11:
                returnValue = 30;
                break;
            case 2:
                if (isLeapYear(year)) {
                    returnValue = 29;
                } else {
                    returnValue = 28;
                }
                break;
            default:
                returnValue = 31;
                break;
        }
        return returnValue;
    }
    public void nextDay(){
        int dayCount = daysInMonth(this.month, this.year);
        this.day++;
        if (this.day > dayCount){
            this.day = 1;
            this.month++;
        }

    }

    public Date(int d, int m, int y){
        this.day = d;
        this.month = m;
        this.year = y;
    }
}
