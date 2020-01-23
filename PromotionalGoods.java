package ua.lviv.iot.first.lab;

public class PromotionalGoods {

    private int discounts;
    private String nameGoods;
    private int startCost;
    private int promotionalCost;

    protected int theNumberOfUnitsOfGoodsSold;
    protected String accessories;

    private String material;
    private double size;
    public static int maxSumOfRevenuePerYear;

   public PromotionalGoods(int disc, String ng, int sc, int pc, int tn, String a, String m, double s) {
        this.discounts = disc;
        this.nameGoods = ng;
        this.startCost = sc;
        this.promotionalCost = pc;
        this.theNumberOfUnitsOfGoodsSold = tn;
        this.accessories = a;
        this.material = m;
        this.size = s;

    }

    public PromotionalGoods(int disc, String ng, int sc, int pc) {
        this(disc, ng, sc, pc, 0, null, null, 0);

    }

    public PromotionalGoods() {

    }

    public int getDiscounts() {
        return discounts;
    }

    public void setDiscounts(int d) {
        this.discounts = d;
    }

    public String getNameGoods() {
        return nameGoods;
    }

    public void setNameGoods(String nd) {
        this.nameGoods = nd;
    }

    public int getStartCost() {
        return startCost;
    }

    public void setStartCost(int sd) {
        this.startCost = sd;
    }

    public int getPromotionalCost() {
        return promotionalCost;
    }

    public void setPromotionalCost(int pc) {
        this.promotionalCost = pc;
    }

    public int getTheNumberOfUnitsOfGoodsSold() {
        return theNumberOfUnitsOfGoodsSold;
    }

    public void setTheNumberOfUnitsOfGoodsSold(int tn) {
        this.theNumberOfUnitsOfGoodsSold = tn;
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String a) {
        this.accessories = a;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String m) {
        this.material = m;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double s) {
        this.size = s;
    }

    @Override
    public String toString() {
        return discounts + " " + nameGoods + " " + startCost + " " + promotionalCost + " " + theNumberOfUnitsOfGoodsSold + " " + accessories + " " + material + " " + size + " " + maxSumOfRevenuePerYear;
    }

    public int printDiscounts() {
        return discounts;
    }

    static public int printStaticMaxSumOfRevenuePerYear() {
        return maxSumOfRevenuePerYear;
    }

    public String printNameGoods() {
        return nameGoods;
    }
    public int printStartCost() {
        return startCost;
    }
    public int printPromotionalCost() {
        return promotionalCost;
    }
    public int printTheNumberOfUnitsOfGoodsSold() {
        return theNumberOfUnitsOfGoodsSold;
    }
    public String printAccessories() {
        return accessories;
    }
    public String printMaterial() {
        return material;
    }
    public double printSize() {
        return size;
    }
    public void resetValues(int disc, String ng, int sc, int pc, int tn, String a, String m, double s, int ms ){
        this.discounts = disc;
        this.nameGoods = ng;
        this.startCost = sc;
        this.promotionalCost = pc;
        this.theNumberOfUnitsOfGoodsSold = tn;
        this.accessories = a;
        this.material = m;
        this.size = s;
        this.maxSumOfRevenuePerYear = ms;

    }


}
