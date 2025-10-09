public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String toString(){
        return "Date[day = " + this.day + ", month = " + this.month + ", year = " + this.year + "]";
    }

    public String getDate(){

        return String.format("%02d",day) + "/" + String.format("%02d",month)  + "/" + year;
    }

    public void setDay(int day) {
        if ((day>0) & (day<32)) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Date must be between 1 and 31");
        }
    }

    public void setMonth(int month) {
        if ((month > 0) & (month < 13)) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
    }

    public void setYear(int year) {
        if ((year > 1979) & (year < 2080)) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be between 1980 and 2079");
        }
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
}