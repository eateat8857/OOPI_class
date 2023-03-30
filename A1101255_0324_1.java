import java.util.Scanner;
class animal{
    String name;
    double height;
    double weight;
    double speed;

    animal(String name,double height,double weight,double speed){
        this.name=name;
        this.height=height;
        this.weight=weight;
        this.speed=speed;
    }
    void show(){
        System.out.println("name:"+this.name);
        System.out.println("height:"+this.height);
        System.out.println("weight:"+this.weight);
        System.out.println("speed:"+this.speed);
        System.out.println();
    }
    double distance(double x,double y){
       return x*y*this.speed;
    }
    double distance(double x){
        return x*this.speed;
    }
}

public class A1101255_0324_1{
    public static void main(String[] args){
        animal[] animals = {
            new animal("雪寶", 1.1, 52, 100),
            new animal("驢子", 1.5, 99, 200),
            new animal("安那", 1.7, 48, 120),
            new animal("愛沙", 1.7, 50, 120)
        };

        Scanner scanner = new Scanner(System.in);

        for(animal animal:animals){
            animal.show();
            System.out.println("輸入奔跑時間(x):"+animal.name);
            double x=scanner.nextDouble();
            System.out.println("輸入加速度(y):"+animal.name);
            double y=scanner.nextDouble();
            
            if (y == 0) {
                System.out.println(animal.name + "距離：" + animal.distance(x));
            } else {
                System.out.println(animal.name + "距離：" + animal.distance(x,y));
            }
            System.out.println();
            }
        }
    }
