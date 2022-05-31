package strategy;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(new MoveStrategy());
        robot.execute();

        robot.setRobotStrategy(new AttackStrategy());
        robot.execute();

        robot.setRobotStrategy(new DefenceStrategy());
        robot.execute();
    }
}

/** 출력
 * Move Robot!
 * Attack Monster!
 * Defence Robot!
 * **/