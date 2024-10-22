public class Daughter extends  Mother {
    //Task 1
    private String hairColor;
    private double heigh;

    public Daughter(String name, int age, String eyeColor, String hairColor, double heigh) {
        super(name, age, eyeColor);
        this.hairColor = hairColor;
        this.heigh = heigh;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }
    public  Double getHeigh(){
        return  heigh;
    }
    public void doteMethod(){
        System.out.println("name+ this is");
    }

    @Override
    public String toString() {
        return "Daughter{" +
                " Mather is name : " +super. getName() + "\n" +
                "Age: "+super.getAge()+"\n"+
                "EyeColor: "+super.getEyeColor()+"\n"+
                "HairColor: "+hairColor +"\n" +
                " Heigh: " + heigh +
                '}';
    }
}