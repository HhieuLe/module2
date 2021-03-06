package model;

public class Student {
    private int id;
    private int stt;
    private String name;
    private String gender;
    private String dayOfBirth;
    private String address;
    private double firstScoreCoefficient1, secondScoreCoefficient1;
    private double scoreCoefficient2, scoreCoefficient3;

    public Student() {
    }

    public Student(int stt, String name, String gender, String dayOfBirth, String address) {
        this.stt = stt;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dayOfBirth = dayOfBirth;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStt() {
        return stt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDoB() {
        return dayOfBirth;
    }

    public void setDoB(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void showInfo() {
        System.out.println("STT: " + getStt() + "   T??n: " + getName() + "   Gi???i t??nh: " + getGender() + "   Ng??y sinh: " + getDoB() + "   ?????a ch???: " + getAddress());
    }

    public void showScore() {
        System.out.println("STT: " + getStt() + "   T??n: " + getName() + "   ??i???m l???n 1: " + getFirstScoreCoefficient1() + "   ??i???m l???n 2: "
                + getSecondScoreCoefficient1() + "   ??i???m l???nn 3: " + getScoreCoefficient2()
                + "   ??i???m l???n 4: " + getScoreCoefficient3() + "   ??i???m trung b??nh: " + getAverageScore());
    }

    public double getAverageScore() {
        double averageSCore=(firstScoreCoefficient1 + secondScoreCoefficient1 + scoreCoefficient2 * 2 + scoreCoefficient3 * 3) / 7;
        return (double)Math.round(averageSCore*10)/10;
    }
}
