public class Date {

    public int day;
    public int month;
    public int year;

    public int daysInMonth(int month, int year){
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
