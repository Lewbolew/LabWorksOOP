package proxy_pattern;

/**
 * Create concrete class implementing the interface Robot.
 */
public class RealRobot implements Robot {
    boolean isAlive = false;
    String name;

    public RealRobot(String name) {
        this.name = name;
        initilier();
    }
    public void initilier() {
        if(!isAlive) {
            isAlive = true;
            System.out.println("I have initilied successfuly");
        } else {
            System.out.println("I have already initilied!");
        }
    }

    @Override
    public void shoot() {
        System.out.println("bax-bax");
    }

    @Override
    public void move() {
        System.out.println("I`m going 3 steps forward!");
    }

    @Override
    public void saySmth() {
        System.out.println("Hello world!");
    }
}
