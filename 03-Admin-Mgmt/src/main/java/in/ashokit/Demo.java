package in.ashokit;


public class Demo{ 
    public static void main( String[] args )
    {
       String encodedString=SecurityService.encode("AshokIt");
       System.out.println(encodedString);
       String decodedString=SecurityService.decode(encodedString);
       System.out.println(decodedString);
    }
}
