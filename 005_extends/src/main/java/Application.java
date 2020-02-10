public class Application {

    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {
        eagles eagle = new eagles();
        eagle.age = "四岁";
        eagle.weight = "5kg";
        eagle.food = "rabbit";


        eagle.live();

        eagle.fly("翱翔天宫");
        eagle.prey(eagle.food);
        eagle.eat();
        eagle.sleep("老鹰");

    }
}
