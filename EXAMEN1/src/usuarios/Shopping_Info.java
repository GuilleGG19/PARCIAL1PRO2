package usuarios;

public class Shopping_Info {
    private int shoppingId;
    private String shoppingType;
    private int shoppingCost;
    private int shoppingRegionId;
    private Order order;

    public Shopping_Info(int shoppingId, String shoppingType, int shoppingCost, int shoppingRegionId) {
        this.shoppingId = shoppingId;
        this.shoppingType = shoppingType;
        this.shoppingCost = shoppingCost;
        this.shoppingRegionId = shoppingRegionId;
    }

    public void updateShoppingInfo()
    {

    }
}
