//Person
class Person {
    private String name;
    private int age;
    private double height;
    private double weight;

    // Constructor
    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    // growOlder method
    public void growOlder() {
        setAge(getAge() + 1);
        setHeight(getHeight() - 1);
    }

    // Overloaded growOlder method to decrease weight
    public void growOlder(double weightLoss) {
        growOlder();
        setWeight(getWeight() - weightLoss);
    }
}


