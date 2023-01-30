package Enum;

public enum WeightCapacity {
    N1(null, 3.49f),N2(3.5f,11.99f),N3(12f, null);

    private Float minCapacity;
    private Float maxCapacity;

    WeightCapacity(Float minCapacity, Float maxCapacity) {
        this.minCapacity = minCapacity;
        this.maxCapacity = maxCapacity;

    }

    public Float getMinCapacity() {
        return minCapacity;
    }

    public void setMinCapacity(Float minCapacity) {
        this.minCapacity = minCapacity;
    }

    public Float getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Float maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        if(minCapacity==null){
            return "Грузоподьемность до: " + getMaxCapacity()+" тонн.";
        } else if (maxCapacity == null) {
            return "Грузоподьемность от: " + getMinCapacity()+" тонн.";
        } else {
            return "Грузоподьемность от: " + getMinCapacity() + " тонн, и до: " + getMaxCapacity() + " тонн.";
        }
    }
}
