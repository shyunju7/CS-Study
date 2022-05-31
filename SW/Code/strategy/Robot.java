package strategy;

public class Robot {

    private RobotStrategy robotStrategy;

    // 로봇 생성
    public Robot(RobotStrategy robotStrategy) {
        this.robotStrategy = robotStrategy;
    }

    // 전략이 변경되었을 때 새로운 전략 행위
    public void setRobotStrategy(RobotStrategy robotStrategy) {
        this.robotStrategy = robotStrategy;
    }

    // 현재 행위를 실행할 메서드
    public void execute() {
        this.robotStrategy.action();
    }
}
