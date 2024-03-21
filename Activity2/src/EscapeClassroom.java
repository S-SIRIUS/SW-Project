
public class EscapeClassroom {
    public static void main(String[] args) {
        String target = args[0].toLowerCase();
        int offset = Integer.parseInt(args[1]);

        String[] split_Target = target.split(" ");
        char[] firstChars = get_First(split_Target);
        int[] charInt = convert_Int(firstChars);
        int[] new_charInt = add_offset(charInt,offset);
        char[] escapeCode = convert_Char(new_charInt);
        char[] escapeMessage = Rearrange(escapeCode);

        System.out.println("message: "+ "\""+args[0]+"\"");
        System.out.println("offset: "+args[1]);
        System.out.print("escapeMessage: ");
        System.out.print(escapeMessage);
    }

    // 첫번째 문자 추출해서 배열 리턴해주는 메소드
    private static char[] get_First(String [] split_Target)
    {
        char[] firstChars = new char[split_Target.length];
        for(int i=0; i<split_Target.length; i++)
        {
            firstChars[i] = split_Target[i].charAt(0);
        }
        return firstChars;
    }

    // 정수로 바꿔주는 메소드
    private static int[] convert_Int(char [] firstChars)
    {
        int[] charInt = new int[firstChars.length];
        for(int i=0; i<firstChars.length; i++)
        {
            charInt[i] = (int)firstChars[i]-96;
        }
        return charInt;
    }

    // 오프셋 추가해주는 메소드 (+ 25넘겼을 조건 추가)
    private static int[] add_offset(int [] charInt, int offset)
    {
        for(int i=0; i<charInt.length; i++)
        {
            int ans=charInt[i] + offset;
            if(ans > 25)
            {
                ans = ans % 26;
            }
            charInt[i] = ans;
        }
        return charInt;
    }


    // 문자로 다시 바꿔주는 메소드
    private static char[] convert_Char(int [] new_charInt)
    {
        char[] escapeCode = new char[new_charInt.length];

        for(int i=0; i<new_charInt.length; i++)
        {
            escapeCode[i] = (char)(new_charInt[i]+96);
        }

        return escapeCode;

    }

    // 역정렬해주는 메소드
    private static char[] Rearrange(char [] escape_Code)
    {
        char [] new_escape_Code = new char[escape_Code.length];
        for (int i=escape_Code.length-1; i>=0; i--) {
            new_escape_Code[escape_Code.length-1-i] = escape_Code[i];
        }
        return new_escape_Code;
    }
}