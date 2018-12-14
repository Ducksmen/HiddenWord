public class HiddenWord
{
    private String field;
    public HiddenWord(String field)
    {
        this.field = field;
    }

    public String getHint(String input)
    {
        int l = this.field.length();
        String output = "";
        for(int i = 0;i<l;i++)
        {
            if(input.substring(i,i+1).equals(field.substring(i,i+1))) {
                output += input.substring(i, i + 1);
            }
            else if (field.indexOf(input.substring(i,i+1))>=0)
            {
                output += "+";
            }
            else
            {
                output += "*";
            }
        }
        return output;
    }
}
