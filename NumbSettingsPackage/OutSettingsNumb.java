package com.Profile.NumbSettingsPackage;

public class OutSettingsNumb extends Operator {

    public String getString;
    private int col;
    public boolean BullNumb;
    private String nameAndFamaling;

    //Приветствие, конструктор
    public OutSettingsNumb(String nameAndFamiling) {
        this.nameAndFamaling = nameAndFamiling;
        col = nameAndFamiling.length();
        SettingsStringHello();
        System.out.print("############## REGISTRITY ##############\n");
    }

    private void SettingsStringHello() {

        switch (col) {
            case 1:
                System.out.println("\n\n" + "           ######" + " Hi " + nameAndFamaling + "! " + "######");
            break;

            case 2:
                System.out.println("\n\n" + "          ######" + "  Hi " + nameAndFamaling + "!  " + "######");
            break;

            case 3:
                System.out.println("\n\n" + "         ######" + "  Hi " + nameAndFamaling + "!  " + "######");
            break;

            case 4:
                System.out.println("\n\n" + "        ######" + "  Hi " + nameAndFamaling + "!  " + "######");
            break;

            case 5:
                System.out.println("\n\n" + "         ######" + " Hi " + nameAndFamaling + "! " + "######");
            break;

            case 6:
                System.out.println("\n\n" + "        ######" + " Hi " + nameAndFamaling + "! " + "######");
            break;

            case 7:
                System.out.println("\n\n" + "       ######" + "  Hi " + nameAndFamaling + "! " + "######");
                break;

            default:
                System.out.println("\n\n" + "        ######" + " Hi " + nameAndFamaling + "! " + "######");
                break;
            }
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
