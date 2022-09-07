package Program01;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double feet;
    private double inches;
    private double bmi;
    private String itp;
    public BMI(){

    }
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
        this.height = (feet*12 + inches)*0.0254;//height to meter
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getWeight() {
        return weight;
    }
    public double getFeet() {
        return feet;
    }
    public double getInches() {
        return inches;
    }
    public double getBMI(){
        bmi = weight/Math.pow(height, 2);
        return bmi;
    }
    public String getInterpretation(){
        if(bmi < 18.5){
            itp = "Underweight";
        }
        else if (bmi>=18.5 && bmi<25){
            itp = "=Normal weight";
        }
        else if (bmi>=25 && bmi<30){
            itp = "Overweight";
        }
        else {
            itp = "Obese";
        }
        return itp;
    }
}
