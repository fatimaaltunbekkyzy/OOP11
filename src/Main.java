//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
Mother mother = new Mother("Gulzat",45,"Blakc");

Daughter daughter = new Daughter("Gulzat",45,"Green","Brown",1.50);
        System.out.println(mother);
        mother.nameMethod();
       System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(daughter);
        daughter.doteMethod();
    }

}