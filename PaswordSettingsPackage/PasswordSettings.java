package com.Profile.PaswordSettingsPackage;

import com.Profile.Profile;

import java.util.Scanner;

public class PasswordSettings extends Profile {

    private String password;

    public boolean BulPas = false;

    public void GetPasword(){
        Scanner scanPas = new Scanner(System.in);

        System.out.print("# Write password(Your password must be at least 9 characters): ");
        password = scanPas.nextLine();
        ProverkaPasswords();
    }

    private void ProverkaPasswords(){
        if(password.length() > 8){
            FinalProverka();
        }else{
            System.out.println("Password less than 9 characters");
            GetPasword();
        }
    }

    private void FinalProverka(){
        String PovtProv;
        Scanner scanPas = new Scanner(System.in);

        System.out.print("# Enter your password again: ");
        PovtProv = scanPas.nextLine();

        if(PovtProv.equals(password)){
            BulPas = true;
        }else{
            System.out.println("password entered is incorrect");
            FinalProverka();
        }

    }

}
