public class UserService{
    public void createUser(User user){
        // think that a User class is already created for the user
        // write your code here to create the user
        System.out.println("User is successfully created");

        System.out.println("Email notification code here"); 
        // as if we change the email provider then we have to modify this class 
        // and if we change the database schema then also we will have to modify the class so
        // it is violating the Single Responsibility principle

    }
    public void deleteUser(int userId){
        // write your user deletion code here
        
    }
}