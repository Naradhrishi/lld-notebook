class Main{
    public static void main(String[] args) {
        Eagle e = new Eagle();
        e.fly();
    }
}


class Bird{
    public void fly(){
        System.out.println("This bird is flying...");
    }
}

class Eagle extends Bird{
    
}

// This is violating Liskov Substitution principle as subclass is unable to substitute the super class
// Just like we can replace / substitute List interface based code using ArrayList any time in Java collections but that behavior is not possible here

class Penguin extends Bird{
    public void fly(){
        System.out.println("Raise exception here as Penguin can't fly");

    }
}