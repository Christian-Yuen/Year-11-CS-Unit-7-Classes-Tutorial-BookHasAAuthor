public class Author {
    private String name;
    private String email;
    private char gender;
    public void setEmail(String email){
        this.email = email;
    }
    public Author(String Author, String email, char gender){
        this.email = email;
        this.name = Author;
        this.gender = gender;


    }

    public String getName (){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public char getGender () {
        return gender;
    }
    public String toString(){
        return name + " (" + gender + ") at " +email;
    }



}
