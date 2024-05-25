public class Adapter {
    public static void PaypalAPI(User u, Company c){
        PaypalAPI p= new PaypalAPI("");
        p.setToken(u.getUsername()+":"+c.getName());
    }
}
