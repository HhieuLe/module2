package StudentAndStudent.Score;

public class physicScore {
    private int id;
    private double firstScoreCoefficient1, secondScoreCoefficient1;
    private double scoreCoefficient2, scoreCoefficient3;

    public physicScore() {
    }

    public physicScore(int id, double firstScoreCoefficient1, double secondScoreCoefficient1, double scoreCoefficient2, double scoreCoefficient3) {
        this.id = id;
        this.firstScoreCoefficient1 = firstScoreCoefficient1;
        this.secondScoreCoefficient1 = secondScoreCoefficient1;
        this.scoreCoefficient2 = scoreCoefficient2;
        this.scoreCoefficient3 = scoreCoefficient3;
    }

    public int getId() {
        return id;
    }

    public double getFirstScoreCoefficient1() {
        return firstScoreCoefficient1;
    }

    public void setFirstScoreCoefficient1(double firstScoreCoefficient1) {
        this.firstScoreCoefficient1 = firstScoreCoefficient1;
    }

    public double getSecondScoreCoefficient1() {
        return secondScoreCoefficient1;
    }

    public void setSecondScoreCoefficient1(double secondScoreCoefficient1) {
        this.secondScoreCoefficient1 = secondScoreCoefficient1;
    }

    public double getScoreCoefficient2() {
        return scoreCoefficient2;
    }

    public void setScoreCoefficient2(double scoreCoefficient2) {
        this.scoreCoefficient2 = scoreCoefficient2;
    }

    public double getScoreCoefficient3() {
        return scoreCoefficient3;
    }

    public void setScoreCoefficient3(double scoreCoefficient3) {
        this.scoreCoefficient3 = scoreCoefficient3;
    }

    public double getAverageScore() {
        return (firstScoreCoefficient1 + secondScoreCoefficient1 + scoreCoefficient2 * 2 + scoreCoefficient3 * 3) / 7;
    }
}
