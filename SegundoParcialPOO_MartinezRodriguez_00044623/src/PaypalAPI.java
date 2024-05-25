public class PaypalAPI {
    String Token;

    public PaypalAPI(String token) {
        Token = token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
