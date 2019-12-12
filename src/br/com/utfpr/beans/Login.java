package br.com.utfpr.beans;

public class Login {

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    private String User;
    private String Password;
    
    public boolean equals(Login login)
    {
        if(login == null)
            return false;
        
        return this.User.equals(login.User) && this.Password.equals(login.Password);
        
    }   
    
    
}
