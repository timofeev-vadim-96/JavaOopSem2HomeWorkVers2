package models.auxilaryModels;

public class MyDate extends java.util.Date {
    @Override
    public String toString() {
        return String.format("%s, %s, %s ", super.getDate(), super.getMonth(), super.getYear());
    }

    public MyDate(int year, int month, int date) {
        super(year, month, date);
    }
}
