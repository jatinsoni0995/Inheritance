package Inheritance;

public class Dog extends Animal{

    private String earShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big", 50);// calling Animal's constructor
    }

    public Dog(String type, double weight){
        this(type,weight,"Perky","Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" :(weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "tailShape='" + tailShape + '\'' +
                ", earShape='" + earShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){

        if(type == "Wolf"){
            System.out.println("Ow woooooo!");
        }
        bark();
        System.out.println();
    }

    //@Override
    public void move(String speed) {
        super.makeNoise();
        System.out.println("Dogs walk, run and wag their tail");
        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){  // private, bcz we will call this bark method only in the same(Dog) class
        System.out.print("Woof!");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("Tail Wagging");
    }
}
