public class Student {
    String name, branch, batch, PRN;
    int Sub1, Sub2, Sub3, Sub4, Sub5;


    Student(String name, String branch, String batch, String PRN, int Sub1, int Sub2, int Sub3, int Sub4, int Sub5)
    {
        this.name = name;
        this.branch = branch;
        this.batch = batch;
        this.PRN = PRN;
        this.Sub1 = Sub1;
        this.Sub2 = Sub2;
        this.Sub3 = Sub3;
        this.Sub4 = Sub4;
        this.Sub5 = Sub5;
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Batch: " + batch);
        System.out.println("PRN: " + PRN);
        System.out.println("Subject 1: " + Sub1);
        System.out.println("Subject 2: " + Sub2);
        System.out.println("Subject 3: " + Sub3);
        System.out.println("Subject 4: " + Sub4);
        System.out.println("Subject 5: " + Sub5);
    }
}