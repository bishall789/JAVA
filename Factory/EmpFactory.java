package Factory;
public class EmpFactory {

    public static Emp getEmp(String type)
    {
        if(type.equalsIgnoreCase("android"))
        {
            return new Android();
        }
        else if(type.equalsIgnoreCase("ios"))
        {
            return new IOS();
        }
        else
        {
            return null;
        }
    }
    
}
