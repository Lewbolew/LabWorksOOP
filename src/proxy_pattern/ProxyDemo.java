package proxy_pattern;

/**
 * Use the ProxyRobot to get object of RealRobot class when required.
 */
public class ProxyDemo {
    public static void main(String[] args) {
        Robot robot = new ProxyRobot("Vasya");
        robot.shoot();
        System.out.println("");
        robot.shoot();
    }
}
