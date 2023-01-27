package Enum;

public enum PassengerSeats {
    EXTRASMALL(null,10),SMALL(11,25),MEDIUM(26,40),LARGE(41,60),EXTRALARGE(61,null);

    private Integer minSeats;
    private Integer maxSeats;

    PassengerSeats(Integer minSeats, Integer maxSeats) {
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
    }

    public Integer getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(Integer minSeats) {
        this.minSeats = minSeats;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    @Override
    public String toString() {
        if(minSeats==null){
            return "Вместимость пассажиров до: " + getMaxSeats()+" человек.";
        } else if (maxSeats == null) {
            return "Вместимость пассажиров от: " + getMinSeats()+" человек.";
        } else {
            return "Вместимость пассажиров от: " + getMinSeats() + " человек, и до: " + getMaxSeats() + " человек.";
        }
    }
}
