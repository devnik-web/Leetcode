class Solution {
    public int romanToInt(String s) {
        String romans="IVXLCDM";
        int valueArray[]={1,5,10,50,100,500,1000};

        int result=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int idx1=romans.indexOf(s.charAt(i));
            int idx2=romans.indexOf(s.charAt(i+1));
            if(idx1<idx2)
            {
                result-=valueArray[idx1];
            }
            else
                result+=valueArray[idx1];
        }
        result+=valueArray[romans.indexOf(s.charAt(s.length()-1))];

        return result;
    }
}