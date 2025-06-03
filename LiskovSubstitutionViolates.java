// Parent class
class Person {
    public void speak() {
        System.out.println("Hello, I can speak.");
    }
}


class Speaker extends Person {
    @Override
    public void speak() {
        System.out.println("Hi! I'm speaking clearly.");
    }
}


class MutePerson extends Person {
    @Override
    public void speak() {
        throw new UnsupportedOperationException("I cannot speak.");
    }
}


public class LiskovSubstitutionViolates {
    public static void main(String[] args) {
        Person speaker = new Speaker();
        Person mute = new MutePerson();

        speaker.speak(); // ✅ Works

        mute.speak();    // ❌ Throws exception — LSP violated
    }
}
