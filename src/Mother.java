public class Mother {
    //Task 1
    private  String name;
    private  int age;
    private String eyeColor;

    public Mother( String name,int age,String eyeColor){
        this.name =name;
        this.age = age;
        this.eyeColor =eyeColor;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;

    }
    public void  setAge(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
    public  String getEyeColor(){
        return eyeColor;
    }
    public  void nameMethod(){
        System.out.println("name+ this is mother");
    }

    @Override
    public String toString() {
        return "Mother{" +
                "name: " + name + "\n" +
                " age: " + age +"\n"+
                ", eyeColor: " + eyeColor + "\n" +
                '}';
    }
}
