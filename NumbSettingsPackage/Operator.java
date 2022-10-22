package com.Profile.NumbSettingsPackage;

import com.Profile.Profile;

public class Operator extends Profile {

//Проверка операторов By
    protected String ProverkaOperatoraBy(){

        String otvetBy = null;

        if(numb.length() == 13) {
            String operator = numb.substring(4, 6);

            switch (operator) {

                case "25":
                    otvetBy = "life";
                    break;

                case "29":
                    otvetBy = "A1";
                    break;

                case "33":
                    otvetBy = "MTS";
                    break;

                case "24":
                    otvetBy = "Beltelecom";
                    break;

                case "44":
                    otvetBy = "A1";
                    break;
            }
        }else if (numb.length() == 11){

            String operator = numb.substring(2, 4);

            switch (operator) {

                case "25":
                    otvetBy = "life";
                    break;

                case "29":
                    otvetBy = "A1";
                    break;

                case "33":
                    otvetBy = "MTS";
                    break;

                case "24":
                    otvetBy = "Beltelecom";
                    break;

                case "44":
                    otvetBy = "A1";
                    break;
            }

        }
        return otvetBy;
    }

    protected String ProverkaOperatoraUSA(){
        String operator = numb.substring(2,5);
        
        String otvetUSA = null;

        switch (operator){

            case "205","251","256","334":
                otvetUSA = "Alabama";
                break;

            case "907":
                otvetUSA = "Alaska";
                break;

            case "480","520","602","623","928":
                otvetUSA = "Arizona ";
                break;

            case "479","501","870":
                otvetUSA = "Arkansas";
                break;

            case "209", "213", "310", "323", "408", "415", "424", "510", "530", "559", "562", "619", "626", "650", "661", "707", "714", "760", "805", "818", "831", "858", "909", "949":
                otvetUSA = "California ";
                break;

            case "303","719","720","970":
                otvetUSA = "Colorado";
                break;

            case "203","475","860","959":
                otvetUSA = "Коннектикут";
                break;

            case "302":
                otvetUSA = "Delaware";
                break;

            case "239", "305", "321", "352", "386", "407", "561", "727", "754", "772", "786", "813", "850", "863", "904", "941", "954":
                otvetUSA = "Florida";
                break;

            case "229", "404", "470", "478", "678", "706", "770", "912":
                otvetUSA = "Georgia";
                break;

            case "808":
                otvetUSA = "Hawaii";
                break;

            case "208":
                otvetUSA = "Idaho";
                break;

            case "217", "224", "309", "312", "331", "464", "618", "630", "708", "773", "779", "815", "847", "872":
                otvetUSA = "Illinois";
                break;

            case "219", "260", "317", "574", "765", "812":
                otvetUSA = "Indiana";
                break;

            case "319", "515", "563", "641", "712":
                otvetUSA = "Job";
                break;

            case "316", "620", "785", "913":
                otvetUSA = "Kansas";
                break;

            case "270", "502", "606", "859":
                otvetUSA = "Kentucky";
                break;

            case "225", "318", "337", "504", "985":
                otvetUSA = "Louisiana";
                break;

            case "207":
                otvetUSA = "Maine";
                break;

            case "227", "240", "301", "410", "443", "667":
                otvetUSA = "Maryland";
                break;

            case "339", "351", "413", "508", "617", "774", "781", "857", "978":
                otvetUSA = "Massachusetts";
                break;


            case "231", "248", "269", "313", "517", "586", "616", "734", "810", "906", "947", "989":
                otvetUSA = "Michigan";
                break;

            case "218", "320", "507", "612", "651", "763", "952":
                otvetUSA = "Minnesota";
                break;

            case "228", "601", "662", "769":
                otvetUSA = "Mississippi";
                break;

            case "314", "417", "557", "573", "636", "660", "816", "975":
                otvetUSA = "Missouri";
                break;

            case "406":
                otvetUSA = "Montana";
                break;

            case "308", "402":
                otvetUSA = "Nebraska";
                break;

            case "702", "775":
                otvetUSA = "Nevada";
                break;

            case "603":
                otvetUSA = "new hampshire";
                break;

            case "201", "551", "609", "732", "848", "856", "862", "908", "973":
                otvetUSA = "New Jersey";
                break;

            case "505":
                otvetUSA = "New Mexico";
                break;

            case "212", "315", "347", "516", "585", "607", "631", "646", "716", "718", "845", "914", "917":
                otvetUSA = "New York";
                break;

            case "252", "336", "704", "828", "910", "919", "984":
                otvetUSA = "North Carolina";
                break;

            case "710":
                otvetUSA = "North Dakota";
                break;

            case "216", "234", "283", "330", "419", "440", "513", "567", "614", "740", "937":
                otvetUSA = "Ohio";
                break;

            case "405", "580", "918":
                otvetUSA = "Oklahoma";
                break;

            case "503", "541", "971":
                otvetUSA = "Pennsylvania";
                break;

            case "401":
                otvetUSA = "Rhode Island";
                break;

            case "803", "843", "864":
                otvetUSA = "South Carolina";
                break;

            case "605":
                otvetUSA = "South Dakota";
                break;

            case "423", "615", "731", "865", "901", "931":
                otvetUSA = "Tennessee";
                break;

            case "210", "214", "254", "281", "325", "361", "409", "430", "432", "469", "512", "682", "713", "737", "806", "817", "830", "832", "903", "936", "940", "956", "972", "979":
                otvetUSA = "Texas";
                break;

            case "435", "801":
                otvetUSA = "Utah";
                break;

            case "802":
                otvetUSA = "Vermont";
                break;

            case "276", "434", "540", "571", "703", "757", "804":
                otvetUSA = "Virginia";
                break;

            case "206", "253", "360", "425", "509", "564":
                otvetUSA = "Washington";
                break;

            case "202":
                otvetUSA = "Washington DC";
                break;


            case "304":
                otvetUSA = "West Virginia";
                break;


            case "262", "414", "608", "715", "920":
                otvetUSA = "Wisconsin";
                break;


            case "307":
                otvetUSA = "Wyoming";
                break;

            case "925":
                otvetUSA = "Texas or California";
                break;
        }
        return otvetUSA;
    }
}
