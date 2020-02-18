package Package16F;

public class AllWovelsWhileLoop {
    public static void main(String[] args) {
        String mySentence="Sunday is fun day";
        int index=0;
        while(index<mySentence.length()){
            if(mySentence.charAt(index)!='u'&& mySentence.charAt(index)!='o'&& mySentence.charAt(index)!='a'&&mySentence.charAt(index)!='e'&& mySentence.charAt(index)!='i')
            System.out.println(mySentence.charAt(index));
            index++;


        }
    }
}
