import java.util.ArrayList;

public class Sandwich {
    private String breadType;
    private Double baseCost;

    private Double costPerItem;

    private ArrayList<String> items;

    public Sandwich(String breadType, Double costPerItem) {
        this.breadType = breadType;
        this.baseCost = 10.;
        this.costPerItem = costPerItem;
        this.items = new ArrayList<>();
    }

    public String getBreadType() {
        return breadType;
    }

    public Double getBaseCost() {
        return baseCost;
    }

    public Double getCostPerItem() {
        return costPerItem;
    }
    public void addItem (String item) {
        items.add(item);
    }
    public Double getTotalCost(){
        Double cost = baseCost + costPerItem * items.size();
        return cost;
    }
}
