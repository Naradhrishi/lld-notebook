class Notification{
    public void sendNotification(String email, String phoneNum){
        if(email != null){
            System.out.println("Send notification via Email");

        }
        if(phoneNum != null){
            System.out.println("Send notification via Phone");
        }
    }
}
