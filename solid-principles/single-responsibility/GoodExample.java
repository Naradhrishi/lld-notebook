public class UserDAO{
    public void save(User user){
        // insertion logic here
        System.out.println("User saved to database");
    }
    public void delete(int userId){
        // deletion logic here
        System.out.println("User deleted from database");
    }
}

class EmailService{
    // write your emails service code here
    public void sendEmail(User user){
        System.out.println("Email sent.");

    }

}