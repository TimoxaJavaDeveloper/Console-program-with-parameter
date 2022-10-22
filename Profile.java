package com.Profile;

import com.Profile.MailSettingsPackage.SettingsMail;
import com.Profile.NumbSettingsPackage.OutSettingsNumb;
import com.Profile.PaswordSettingsPackage.PasswordSettings;

import java.util.Scanner;

public class Profile {

    private String FinalSettingsNumb;
    private boolean BulNumb;
    private boolean BulMail;
    private boolean BulPas;
    protected String numb;
    protected String YouName;
    protected static String mail;

    void SetProfile(){
        SetName();

        OutSettingsNumb test = new OutSettingsNumb(YouName);
        test.SettingsNumb();
        FinalSettingsNumb = test.getString;
        BulNumb = test.BullNumb;

        PasswordSettings pasSet = new PasswordSettings();
        pasSet.GetPasword();
        BulPas = pasSet.BulPas;

        SettingsMail testMail = new SettingsMail();
        setMail();
        testMail.FinalSettingsMail();
        BulMail = testMail.BulMail;

        GetProfile();


    }

    private void SetName(){
        Scanner scanProfile = new Scanner(System.in);

        System.out.println("Write you name");
        YouName = scanProfile.nextLine();

    }

    protected void setNumb(){
        Scanner scanNamb = new Scanner(System.in);

        System.out.print("# Set numb please: ");
        String numb = scanNamb.nextLine();
        this.numb = numb;
    }

    protected void setMail(){
        Scanner scanMail = new Scanner(System.in);

        System.out.print("# Write mail please: ");
        String mail = scanMail.nextLine();
        this.mail = mail;
    }


    void GetProfile(){

        if(BulMail == true && BulNumb == true && BulPas == true){
            System.out.println("\n\n############## You is registrity ##############");
        }else{
            System.out.println("\n\n############## Not registrity, you numb or mail or password is not found ##############");
            System.exit(0);
        }

        System.out.println("Name: " + YouName);

        System.out.println("You numbs: " + FinalSettingsNumb);

        System.out.println("You mail: " + mail + " Google mail");


    }



}
