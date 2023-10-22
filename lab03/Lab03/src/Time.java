public class Time {
    public int hours;
    public int minutes;

    public Time addTime(Time otherTime){
        int godziny = this.hours + otherTime.hours;
        int minuty = this.minutes + otherTime.minutes;
        Time returnTime = new Time();
        returnTime.minutes = minutes%60;
        returnTime.hours = godziny%24;
        return returnTime;
    }

}
