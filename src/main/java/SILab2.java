import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {
    public List<Integer> function(List<Time> timesList) { //A
        List<Integer> result = new ArrayList<>(); // B

        for (int i = 0; i < timesList.size(); i++) { //D
             int hr = timesList.get(i).getHours(); // F
            int min = timesList.get(i).getMinutes(); // G
            int sec = timesList.get(i).getSeconds(); // H
            if (hr < 0 || hr > 24){ // I TX || FT || FF
                if (hr < 0){  // K
                    throw new RuntimeException("The hours are smaller than the minimum"); // L
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum");// M
                }
            }
            else if (hr < 24) {  // J
                if (min < 0 || min > 59) // N TX || FT || FF
                    throw new RuntimeException("The minutes are not valid!"); // O
                else {
                        result.add(hr * 3600 + min * 60 + sec); //S
                    else
                        throw new RuntimeException("The seconds are not valid"); // Q
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) { // R got
                result.add(hr * 3600 + min * 60 + sec); // S
            }
            else {
                throw new RuntimeException("The time is greater than the maximum"); // T
            }
        }
        return result; // E
    }
}
