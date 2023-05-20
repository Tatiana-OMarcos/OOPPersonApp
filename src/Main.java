public class Main {
    // main method
    public static void main(String[] args) {
        System.out.println("===City of CrankyBoy Person Details in 2023===");
        // create person 1
        Person Person01 = new Person("James Peterson", 34, 180, 73.5);

        System.out.println("==============================");
        System.out.println("Name = " + Person01.getName());
        System.out.println("Age = " + Person01.getAge());
        System.out.println("Height = " + Person01.getHeight() + " cm");
        System.out.println("Weight = " + Person01.getWeight() + " lbs");


        // create person 2 Bob Thornley, 25, 171cm, 68.2lbs and print
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);
        System.out.println("==============================");
        System.out.println("Name = " + Person02.getName());
        System.out.println("Age = " + Person02.getAge());
        System.out.println("Height = " + Person02.getHeight() + " cm");
        System.out.println("Weight = " + Person02.getWeight() + " lbs");

        // Call growOlder method on James
        Person01.growOlder();


        // Call growOlder method with weight loss on James
        Person01.growOlder(0.5);

        // Print details again
        System.out.println("==================================");
        System.out.println("Person 1 Prediction for 2024:");
        System.out.println("Name: " + Person01.getName());
        System.out.println("Age: " + Person01.getAge());
        System.out.println("Height: " + Person01.getHeight() + "cm");
        System.out.println("Weight: " + Person01.getWeight() + "lbs");
    }
}



