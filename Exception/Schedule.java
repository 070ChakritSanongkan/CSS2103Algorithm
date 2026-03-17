import java.sql.Time;

public class Schedule {

    private String day;
    private Time startTime;
    private Time endTime;
    private String room;

    public Schedule() {}

    public Schedule(String day, Time startTime, Time endTime, String room) {
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
    }

    public void setDay(String day) {
        try {
            if (day == null) {
                throw new Exception("Day cannot be null");
            }
            this.day = day;

        } catch (Exception e) {
            System.out.println("Error setting day: " + e.getMessage());
        }
    }

    public String getDay() {
        return day;
    }

    public void setStartTime(Time startTime) {
        try {
            if (startTime == null) {
                throw new Exception("Start time cannot be null");
            }
            this.startTime = startTime;

        } catch (Exception e) {
            System.out.println("Error setting start time: " + e.getMessage());
        }
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setEndTime(Time endTime) {
        try {
            if (endTime == null) {
                throw new Exception("End time cannot be null");
            }
            this.endTime = endTime;

        } catch (Exception e) {
            System.out.println("Error setting end time: " + e.getMessage());
        }
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setRoom(String room) {
        try {
            if (room == null) {
                throw new Exception("Room cannot be null");
            }
            this.room = room;

        } catch (Exception e) {
            System.out.println("Error setting room: " + e.getMessage());
        }
    }

    public String getRoom() {
        return room;
    }

public void checkConflict() {
    try {
        if (startTime.after(endTime)) {
            throw new Exception("Time conflict");
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}
}