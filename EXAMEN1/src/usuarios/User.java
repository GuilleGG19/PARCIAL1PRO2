package usuarios;
import java.util.Date;

public abstract class User {
    private String userId;
    private String password;
    private String loginStatus;
    private Date registerDate;

    public boolean verifyLogin()
    {
        return false;
    }

}
