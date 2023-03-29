
public class JavaStringQuiz11 {
    public static void main (String args[])
    {
        String string="JAVA";
        StringBuffer sbuffer= new StringBuffer(string);
        StringBuilder sBuilder = new StringBuilder(string);
        System.out.println(string.equals(sbuffer));
        System.out.println(string.equals(sBuilder));
        System.out.println(sbuffer.equals(sBuilder));
        System.out.println("Java Concept of the day ".substring(8,4));
        
        

    }
    
}