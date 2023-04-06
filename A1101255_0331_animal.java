import java.util.Scanner;

public class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public double getSpeed(){
        return speed;
    }

    public String getName(){
        return name;
    }

    public void show() {
        System.out.println("姓名: " + name);
        System.out.println("身高: " + height + "公尺");
        System.out.println("體重: " + weight+ "公斤");
        System.out.println("速度: " + speed+ "公尺/分鐘");
    }

    public double distance(double x, double y) {
        return x * y * speed;
    }

    public double distance(double x) {
        return x * speed;
    }

    public static void showinfo() {
        System.out.println("歡迎進入冰雪系統");
    }
}
