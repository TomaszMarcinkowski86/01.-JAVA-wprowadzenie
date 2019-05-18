package pl.sda.java.Day6.Repeat.IfOrSwich;

public class GradeConventer {


    public String convert(int grade) {

        if (grade == 1) {
            return "niedostateczny";
        } else if (grade == 2) {
            return "mierny";
        } else if (grade == 3) {
            return "dostateczny";
        } else if (grade == 4) {
            return "dobry";
        } else if (grade == 5) {
            return "bardzo dobry";
        } else if (grade == 6) {
            return "celujący";
        } else
            return "nieznzny";

    }

    public String convertSwich(int grade) {

        switch (grade) {
            case 1:
                return "niedostateczny";
            case 2:
                return "mierny";
            case 3:
                return "dostateczny";
            case 4:
                return "dobry";
            case 5:
                return "bardzo dobry";
            case 6:
                return "celujący";
            default:
                return "nieznany";
        }
    }
}

