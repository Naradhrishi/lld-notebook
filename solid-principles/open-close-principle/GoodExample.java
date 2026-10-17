interface NotificationChannel{
    void send(); // as this abstract method does not have parameter so make sure while overriding don't add any parameters
}

class PhoneNotification implements NotificationChannel{
    String phone;

    public PhoneNotification(String phone){
        this.phone = phone;

    }

    @Override 
    public void send(){
        System.out.println("Sending notification via" + this.phone);
    }
}

class EmailNotification implements  NotificationChannel{
    String email; 
    public NotificationChannel(String email){
        this.email = email;

    }
    
    @Override 
    public void send(){ // here override method must have same definition and signature
        System.out.println("Sending notification via"+ this.email);
    }
}