public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int daysInBetween(Date other) {
        int days1 = this.year * 360 + this.month * 30 + this.day;
        int days2 = other.year * 360 + other.month * 30 + other.day;
        return Math.abs(days1 - days2);
    }
}

