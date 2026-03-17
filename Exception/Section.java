public class Section {

    private String sectionId;
    private int sectionCapacity;
    private int currentSeat;
    private Instructor instructor;

    public Section() {}

    public Section(String sectionId, int sectionCapacity, int currentSeat, Instructor instructor) {
        this.sectionId = sectionId;
        this.sectionCapacity = sectionCapacity;
        this.currentSeat = currentSeat;
        this.instructor = instructor;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        try {
            if (sectionId == null) {
                throw new Exception("Section ID cannot be null");
            }
            this.sectionId = sectionId;

        } catch (Exception e) {
            System.out.println("Error setting section ID: " + e.getMessage());
        }
    }

    public int getSectionCapacity() {
        return sectionCapacity;
    }

    public void setSectionCapacity(int sectionCapacity) {
        try {
            if (sectionCapacity <= 0) {
                throw new Exception("Section capacity cannot be 0 or negative");
            }
            this.sectionCapacity = sectionCapacity;

        } catch (Exception e) {
            System.out.println("Error setting section capacity: " + e.getMessage());
        }
    }

    public int getCurrentSeat() {
        return currentSeat;
    }

    public void setCurrentSeat(int currentSeat) {
        try {
            if (currentSeat < 0) {
                throw new Exception("Current seat cannot be negative");
            }
            this.currentSeat = currentSeat;

        } catch (Exception e) {
            System.out.println("Error setting current seat: " + e.getMessage());
        }
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        try {
            if (instructor == null) {
                throw new Exception("Instructor cannot be null");
            }
            this.instructor = instructor;

        } catch (Exception e) {
            System.out.println("Error setting instructor: " + e.getMessage());
        }
    }

public void checkSeat() {
    try {
        if (currentSeat >= sectionCapacity) {
            throw new Exception("Section is full");
        }
    } catch (Exception e) {
        System.out.println("Error checking seat: " + e.getMessage());
    }
}

    public void addSeat() {
        try {
            if (currentSeat >= sectionCapacity) {
                throw new Exception("Cannot add seat, section is full");
            }

        } catch (Exception e) {
            System.out.println("Error adding seat: " + e.getMessage());
        }
    }

    public void removeSeat() {
        try {
            if (currentSeat <= 0) {
                throw new Exception("No seat to remove");
            }

        } catch (Exception e) {
            System.out.println("Error removing seat: " + e.getMessage());
        }
    }
}