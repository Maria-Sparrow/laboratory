public class Main {
    public static void main(String[] args) {
        PromotionalGoods Xs = new PromotionalGoods();
        PromotionalGoods XPro = new PromotionalGoods(45, "iPhone", 12000, 6600);
        PromotionalGoods SPlus = new PromotionalGoods(30, "iPhone", 10000, 7000, 14353, "headset", "metal", 5.5, 113456789);

        Xs.toString();
        System.out.println("\n\n\n\n\n");
        XPro.toString();
        System.out.println("\n\n\n\n\n");
        SPlus.toString();
        System.out.println("\n\n\n\n\n");

        PromotionalGoods[] arrayOfPromotionalGoods = new PromotionalGoods[4];
        int something = 0;
        do {
            arrayOfPromotionalGoods[something] = new PromotionalGoods();
            something++;
        }
        while (something < 4);
            for(PromotionalGoods i:arrayOfPromotionalGoods  ){
                i.toString();
                System.out.println("\n");
            }
    }
}
