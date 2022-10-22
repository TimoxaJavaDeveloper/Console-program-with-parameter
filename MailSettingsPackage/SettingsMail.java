package com.Profile.MailSettingsPackage;
import com.Profile.Profile;

public class SettingsMail extends Profile {

    public boolean BulMail = false;

    public void FinalSettingsMail() {
        int LangMail = mail.length();
        if(LangMail<11){
            System.out.println("You mail write not found");

        }else{
        int FinalLangMail = LangMail - 10;

        String mailLang = mail.substring(FinalLangMail,LangMail);

        if(mailLang.equals("@gmail.com")) {
            BulMail = true;
        }
        }

    }
}
