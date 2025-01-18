package Midterm01;

public abstract class Animal {
    
    private String name = "";
    private int power = 0;
    private int age = 0;
    
    public Animal() {
        this("", 0, 0);
    }
    
    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
    
    @Override
    public String toString() {
        return "Animal : name = " + name + ", power = " + power + ", age = " + age;
    }
    
    public boolean equals(Animal a) {
        //if (this.name.equals(a.name) && (this.age == a.age))
        if (this.name.equals(a.name)) {
            if (this.age == a.age) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }
    
    public abstract void eat(Food f);
}
