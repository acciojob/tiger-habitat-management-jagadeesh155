public class SumatranTiger implements Tiger {
    private String color;
    private double avgWeight;
    private String climate;

    public SumatranTiger(String color, double avgWeight, String climate) {
        this.color = color;
        this.avgWeight = avgWeight;
        this.climate = climate;
    }

    @Override
    public String getType() { return "Sumatran"; }
    @Override
    public String getColor() { return color; }
    @Override
    public double getAverageWeight() { return avgWeight; }
    @Override
    public String getPreferredClimate() { return climate; }
}
