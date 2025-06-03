// Base class
class Animals {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}

// Dog subclass
class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

// Cat subclass
class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}


class LiskovSubstitutionCorrect {
    public static void main(String[] args) {
       
        Animals myDog = new Dog();
        Animals myCat = new Cat();

        
        myDog.makeSound();
        myCat.makeSound(); 
    }
}



