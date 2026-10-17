class Bird{
    public void eat(){
        System.out.println("Bird is eating...");

    }
}

class FlyingBird extends Bird{
    public void fly(){
        System.out.println("Bird is flying...");
    }
}

class Eagle extends FlyingBird{

}

class Penguin extends Bird{
    
}