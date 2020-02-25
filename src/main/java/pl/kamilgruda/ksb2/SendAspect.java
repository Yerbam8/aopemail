package pl.kamilgruda.ksb2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SendAspect {
    @Autowired
    EmailUtils emailUtils;

    @After("@annotation(SendEmail)")
    private void afterAddToDb() {
        emailUtils.sendMail("kamil.gruda94@gmail.com", "Test", "Witam z aplikacji");
    }
}
