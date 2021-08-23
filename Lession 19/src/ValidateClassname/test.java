package ValidateClassname;

public class test {
    private static ClassNameExample nameExample;
    private static final String[] validAccount = new String[]{"C0318G","C0621H"};
    private static final String[] invalidAccount=new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        nameExample = new ClassNameExample();
        for(String name : validAccount){
            boolean isvalid =  nameExample.validate(name);
            System.out.println("Name is "+ name+ " is valid "+isvalid);
        }
        for (String name: invalidAccount){
            boolean isvalid = nameExample.validate(name);
            System.out.println("Name is "+name+" is valid "+ isvalid);
        }
    }
}
