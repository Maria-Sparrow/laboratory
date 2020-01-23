import java.util.Scanner;


public class PromotionalGoods {

    private int discounts = 45;
    private String name_goods = "iPhone";
    private int start_cost = 11000;
    private int promotional_cost = 6050;

    protected int the_number_of_units_of_goods_sold = 14353;
    protected String accessories = "headset";

    private String material = "metal";
    private double size = 6.5;
    public static int max_sum_of_revenue_per_year = 120000000;

    PromotionalGoods() {
    }

    ;

    PromotionalGoods(int disc, String ng, int sc, int pc) {
        this.discounts = disc;
        this.name_goods = ng;
        this.start_cost = sc;
        this.promotional_cost = pc;

    }

    PromotionalGoods(int disc, String ng, int sc, int pc, int tn, String a, String m, double s, int ms) {
        this(disc, ng, sc, pc);
        this.the_number_of_units_of_goods_sold = tn;
        this.accessories = a;
        this.material = m;
        this.size = s;
        this.max_sum_of_revenue_per_year = ms;
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
        return discounts + " " + name_goods + " " + start_cost + " " + promotional_cost + " " + the_number_of_units_of_goods_sold + " " + accessories + " " + material + " " + size + " " + max_sum_of_revenue_per_year;
    }

    public int printDiscounts() {
        return discounts;
    }

    static public int printStaticMax_sum_of_revenue_per_year() {
        return max_sum_of_revenue_per_year;
    }

    public String printName_goods() {
        return name_goods;
    }
    public int printStart_cost() {
        return start_cost;
    }
    public int printPromotional_cost() {
        return promotional_cost;
    }
    public int printThe_number_of_units_of_goods_sold() {
        return the_number_of_units_of_goods_sold;
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
        this.name_goods = ng;
        this.start_cost = sc;
        this.promotional_cost = pc;
        this.the_number_of_units_of_goods_sold = tn;
        this.accessories = a;
        this.material = m;
        this.size = s;
        this.max_sum_of_revenue_per_year = ms;

    }
    }

