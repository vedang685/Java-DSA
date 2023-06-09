public class placeholderAndStringBuilder
{
    public static void main(String[] args) {
        System.out.printf("Hello my name is %d", 42);
        // taken from c language
        // println calls tostring method and converts everything into string
        System.out.println(32+""+42);// if one of them is string the output
        // would be string
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        String s = "hot";
        String v = "hot";
        if(s == v)
        {
            System.out.println("true");
        }
    }
}
