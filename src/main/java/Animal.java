public class Animal {
    public void animalSound() {
        System.out.println("Animal makes sound");
    }


}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("bhau waw");
    }
}

class pig extends Animal {
    public void animalSound() {
        System.out.println(" wee wee");
    }
}

class Test {
    public static void main(String[] args) {
        Animal myanimal = new Animal();
        Animal mydog = new Dog();
        Animal mypig = new pig();
        myanimal.animalSound();
        mypig.animalSound();
        mydog.animalSound();

    }
}
