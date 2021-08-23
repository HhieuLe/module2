package ValidatePhoneNumber;

import ValidateAcc.ValidateAcc;

public class non {
    private static PhoneNumberExample phoneNumberExample;
    private  static String non="Non Thanh Bình";

    public static final  String[] validAccount = new String[]{"(84)-(0978489648)"};
    public static final  String[] invalidAccount= new String[]{"(a8)-(22222222)"};
    public  static void main(String args[]){
        phoneNumberExample = new PhoneNumberExample();
        for(String phone : validAccount){
            boolean isvalid = phoneNumberExample.validate(phone);
            System.out.println("Phone is "+ phone + " is valid: "+isvalid);
        }for(String phone : invalidAccount){
            boolean isvalid  = phoneNumberExample.validate(phone);
            System.out.println("Phone is "+ phone+ " is valid "+isvalid);
        }
        System.out.println(non);
    }
}
2