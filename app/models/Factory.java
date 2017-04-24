package models;
//J.T.-----------------------------------------------------------------------------------------------------------
import com.avaje.ebean.Model;
// Factory calss is made to help get varibales out of formFactory. It can expect only 1 variables unlike some classes 
// which might have a required fields which you dont want to inicilize again.
public class Factory extends Model {

    private String strFormat1;
    private String strFormat2;
    private String strFormat3;
    private String strFormat4;
    private String strFormat5;

    private int intFormat;

    public Factory(){
    }

    //Get String

    public String getStrFormat1() {
        return strFormat1;
    }

    public void setStrFormat1(String strFormat1) {
        this.strFormat1 = strFormat1;
    }

    public String getStrFormat2() {
        return strFormat2;
    }

    public void setStrFormat2(String strFormat2) {
        this.strFormat2 = strFormat2;
    }

    public String getStrFormat3() {
        return strFormat3;
    }

    public void setStrFormat3(String strFormat3) {
        this.strFormat3 = strFormat3;
    }

    public String getStrFormat4() {
        return strFormat4;
    }

    public void setStrFormat4(String strFormat4) {
        this.strFormat4 = strFormat4;
    }

    public String getStrFormat5() {
        return strFormat5;
    }

    public void setStrFormat5(String strFormat5) {
        this.strFormat5 = strFormat5;
    }

    public int getIntFormat() {
        return intFormat;
    }

    public void setIntFormat(int intFormat) {
        this.intFormat = intFormat;
    }
}
