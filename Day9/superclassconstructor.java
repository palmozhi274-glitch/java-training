package Day9;

class Animal {
    Animal() {
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog Constructor");
    }

    public static void main(String[] args) {
        new Dog();
    }
}
