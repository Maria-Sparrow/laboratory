package ua.lviv.iot.first.lab;

public class PromotionalGoodsMaker {
    public static void main(String[] args) {

        PromotionalGoods Xs = new PromotionalGoods();
        PromotionalGoods XPro = new PromotionalGoods(45, "iPhone", 12000, 6600);
        PromotionalGoods SPlus = new PromotionalGoods(30, "iPhone", 10000, 7000, 14353, "headset", "metal", 5.5);

        Xs.toString();
        System.out.println(Xs);
        XPro.toString();
        System.out.println(XPro);
        SPlus.toString();
        System.out.println(SPlus);

        PromotionalGoods[] arrayOfPromotionalGoods = new PromotionalGoods[4];
        int something = 0;
        do {
            arrayOfPromotionalGoods[something] = new PromotionalGoods();
            something++;
        }
        while (something < 4);
        for(PromotionalGoods i : arrayOfPromotionalGoods ) {
            i.toString();
            System.out.println(i);
        }
    }
}
