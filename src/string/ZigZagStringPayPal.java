package string;

class ZigZagString{

    public static void main(String[] args){
        //System.out.print(printZigZagString("ABCDEFGH",2));
        System.out.print(printZigZagString("GEEKSFORGEEKS",3));
    }



    public static String printZigZagString(String str,int n){
        if(str==null){return null;}
        if(n==1){return str;}
        boolean topToBottom=true;
        String[] strArray=new String[n+1];
        int ii=1;
        for(int i=0;i<str.length();i++){
            if(strArray[ii]!=null)
            {strArray[ii]=strArray[ii]+str.charAt(i);}
            else{
                strArray[ii]= String.valueOf(str.charAt(i));
            }

            if(ii==n){topToBottom=!topToBottom;}
            if(ii==1){topToBottom=true;}
            if(!topToBottom){ii--;}
            else{
                ii++;
            }

        }
        String opStr="";
        for(int i=1;i<=n;i++)
        {
            opStr=opStr+strArray[i];
        }

        return opStr;
    }



}
