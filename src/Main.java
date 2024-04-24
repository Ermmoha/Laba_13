interface Product{
    void TovarName();
    void TovarPrice();
    void TovarRating();
}
interface User{
    void Login();
    void Password();
}
class Xbox_X implements Product{
    String Name;
    double Price;
    double Rating;
    Xbox_X(String Name, double Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void TovarName() {
        System.out.println(Name);
    }

    @Override
    public void TovarPrice() {
        System.out.println(Price);
    }

    @Override
    public void TovarRating() {
        System.out.println(Rating);
    }
}
class Xbox_S implements Product{
    String Name;
    double Price;
    double Rating;
    Xbox_S(String Name, double Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void TovarName() {
        System.out.println(Name);
    }

    @Override
    public void TovarPrice() {
        System.out.println(Price);
    }

    @Override
    public void TovarRating() {
        System.out.println(Rating);
    }
}
class Xbox_One implements Product{
    String Name;
    double Price;
    double Rating;
    Xbox_One(String Name, double Price, double Rating){
        this.Name = Name;
        this.Price = Price;
        this.Rating = Rating;
    }
    @Override
    public void TovarName() {
        System.out.println(Name);
    }

    @Override
    public void TovarPrice() {
        System.out.println(Price);
    }

    @Override
    public void TovarRating() {
        System.out.println(Rating);
    }
}
class User1 implements User {
    String Login;
    String Password;
    User1(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class User2 implements User {
    String Login;
    String Password;
    User2(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class User3 implements User {
    String Login;
    String Password;
    User3(String Login, String Password){
        this.Login = Login;
        this.Password = Password;
    }
    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
}
class Realise implements User, Product{
    double Price;
    double Rating;
    String Login;
    String Password;
    String ProductName;
    Realise( double Price, double Rating, String Login, String Password, String ProductName){
        this.Price = Price;
        this.Rating = Rating;
        this.Login = Login;
        this.Password = Password;
        this.ProductName = ProductName;
    }
    @Override
    public void TovarName() {
        System.out.println(ProductName);
    }

    @Override
    public void TovarPrice() {
        System.out.println(Price);
    }

    @Override
    public void TovarRating() {
        System.out.println(Rating);
    }

    @Override
    public void Login() {
        System.out.println(Login);
    }

    @Override
    public void Password() {
        System.out.println(Password);
    }
    void display(){
        System.out.println(Login + " приобрел " + ProductName + "С рейтингом" + Rating );
    }
}

public class Main {
    public static void main(String[] args) {
        Xbox_S xbox_s = new Xbox_S("Xbox S", 21999.99, 8.8);
        Xbox_X xbox_x = new Xbox_X("Xbox X", 50000, 9.5);
        Xbox_One xbox_one = new Xbox_One("Xbox One", 12000, 10);
        User1 user1 = new User1("Ermoha", "Viski009");
        User2 user2 = new User2("Lehach", "123456789");
        User3 user3 = new User3("Olivie", "oooOOO");
        Realise realise = new Realise(xbox_one.Price, xbox_one.Rating, user1.Login, user1.Password, xbox_one.Name);
        realise.display();

    }
}