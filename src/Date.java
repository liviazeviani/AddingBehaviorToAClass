public class Date {

    public int day;
    public int month;
    public int year;

   
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
