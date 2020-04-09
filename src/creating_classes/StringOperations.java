package creating_classes;

import static javax.management.Query.value;

public class StringOperations {
    String value;
    public StringOperations(){
this.value=" ";
    }
    public StringOperations(String value){
        this.value=value;
    }

    @Override
    public String toString() {
        return "StringOperations{" +
                "value='" + value + '\'' +
                '}';
    }

    public String returnReversed(){
        String reversed=" ";
        for(int i=this.value.length()-1;i>=0;i--){
            reversed+=this.value.charAt(i);
                    }
        return reversed;
    }
    public String FirstLetterUpperCase(){
        //first concat first letter and convert that letter to upper
        String result="";
        String frstLettetrUpCase=" ";//this variable for converting to string
        frstLettetrUpCase+=this.value.charAt(0);//concat first letter with first char
        //System.out.println(result);
        result+=frstLettetrUpCase.toUpperCase();// concat first letter upper case and result
        //System.out.println(result)
        String letter="";
        for(int i=1;i<this.value.length();i++){
            //check if it is space previus char
            if(this.value.charAt(i-1)==' '){
                //check previous char if it is space first convert to String using concat and then conver to Upper
                letter+=  this.value.charAt(i);//converting String
                letter=letter.toUpperCase();//converting upper
                result+=letter; // concat to result
                letter="";//reset for the second word
            }
            else{
                result+=this.value.charAt(i);
            }
        }
        return result;
    }
    public String[] returnString(){
        String[]result=new String [this.value.length()];
        String letter;
        for(int i=0;i<this.value.length();i++){
            letter=""+this.value.charAt(i);
            result[i]=letter;
            letter="";
        }
        return result;
        }
        public String[]returnSentence(){
        int numberOfSpaces=1;
        for(int i=0;i<this.value.length();i++){
            if(this.value.charAt(i)==' '){
                numberOfSpaces++;
            }
        }
        String []words=new String[numberOfSpaces];
        String word="";
        int index=0;
        for(int i=0;i<this.value.length();i++){
            if(this.value.charAt(i)!=' '){
                word+=this.value.charAt(i);
            }
            else{
                words [index]=word;
                index++;
                word="";
            }
        }
        return words;
    }
}
