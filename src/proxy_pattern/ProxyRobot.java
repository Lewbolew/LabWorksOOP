package proxy_pattern;

/**
 * Create concrete classe implementing the  interface Robot
 */
public class ProxyRobot implements Robot{
    private Robot robot;
    String name;

    public ProxyRobot(String name) {
        this.name = name;
    }

    @Override
    public void shoot() {
        if (robot == null) {
            robot = new RealRobot(name);
        }
        robot.shoot();
    }

    @Override
    public void move() {
        if (robot == null) {
            robot = new RealRobot(name);
        }
        robot.move();
    }

    @Override
    public void saySmth() {
        if (robot == null) {
            robot = new RealRobot(name);
        }
        robot.saySmth();
    }
}
