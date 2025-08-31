public class SiberianTiger implements Tiger {
    private String color;
    private double avgWeight;
    private String climate;

    public SiberianTiger(String color, double avgWeight, String climate) {
        this.color = color;
        this.avgWeight = avgWeight;
        this.climate = climate;
    }

    @Override
    public String getType() { return "Siberian"; }
    @Override
    public String getColor() { return color; }
    @Override
    public double getAverageWeight() { return avgWeight; }
    @Override
    public String getPreferredClimate() { return climate; }
}
