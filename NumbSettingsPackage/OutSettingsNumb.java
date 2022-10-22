package com.Profile.NumbSettingsPackage;

public class OutSettingsNumb extends Operator {

    public String getString;
    public boolean BullNumb;

    //Приветствие, конструктор
    public OutSettingsNumb(String nameAndFamiling) {
        System.out.print("\n\n" + "        ######" + " Hi " + nameAndFamiling + "! " + "######\n" +
                         "############## REGISTRITY ##############\n");
    }

    //Метод проверки страны т.е. код номера

    public void SettingsNumb() {
        setNumb();

        String numb;
        numb = this.numb;

        if (numb.length() == 13 || numb.length() == 11) {

            String code = numb.substring(0, 4);

            switch (code) {
                case "8029":
                    if (numb.length() == 11) {

                        getString = numb + " (" +  "Belarus " + ProverkaOperatoraBy() + ")";
                        BullNumb = true;

                    }
                    break;


                case "+375":
                    if (numb.length() == 13) {

                        getString = numb + " (" +  "Belarus " + ProverkaOperatoraBy() + ")";
                        BullNumb = true;

                    }
                    break;
                default:
                    System.out.println("You numb location is not found");
            }

        } else if (numb.length() == 12) {

            String code = numb.substring(0, 2);

            switch (code) {

                case "+7":
                    if (numb.length() == 12) {

                        getString = numb + " (" +  "Russia " + ProverkaOperatoraUSA() + ")";
                        BullNumb = true;

                    }
                    break;

                case "+1":
                    if (numb.length() == 12) {

                        getString = numb + " (" +  "USA " + ProverkaOperatoraUSA() + ")";
                        BullNumb = true;

                    } else {
                        System.out.println("Not found");

                    }
                    break;
                default:
                    System.out.println("You numb location is not found");
            }

        } else {
            System.out.println("You numb location is not found or you numb write not found");
            getString = "numb is not found";
        }
    }

}
