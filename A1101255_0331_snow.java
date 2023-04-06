public class Snow extends Human {
    private String IceSkill;

    public Snow(String name, double height, double weight, double speed, String gender, String IceSkill) {
        super(name, height, weight, speed, gender);
        this.IceSkill = IceSkill;
    }


    public void show() {
        super.show();
        System.out.println("冰凍技能: " + IceSkill);
    }

 
    public double distance(double x, double y) {
        double speed;
        speed=super.getSpeed();
        if(y==0){
            return distance(x);
        }
        else{
            x=x*speed*y*2;
        return x;
        } 
    }

   
    public double distance(double x) {
        double speed;
        speed=super.getSpeed();
        x=x*speed*2;
        return x;
    }
}
