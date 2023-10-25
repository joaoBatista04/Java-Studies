package simulado_q1;

import java.util.Date;

public class VerifiedUser extends User {

    private Date verificationDate;

    public VerifiedUser(String id) {
        super(id);
        this.verificationDate = new Date();
    }

    public Date getVerificationDate()
    {
        return this.verificationDate;
    }
    
}
