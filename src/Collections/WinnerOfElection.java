package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WinnerOfElection {
    public static void main(String[] args) {
        String[]runners= {"John","Johny","Jackie","Jamie","Johny","Jackie","Jamie","Jackie","Jamie","Jamie"};
        System.out.println(findWinner(runners));
        }
    public static String findWinner(String []candidates){
        String winner="";
        HashMap<String,Integer>votes=new HashMap<>(10);
            for(String person:candidates){
                if(votes.containsKey(person)){
                    votes.put(person,votes.get(person)+1);
                }
                else{
                    votes.put(person,1);
                }
        }
        System.out.println(votes);
        Iterator totalVotes= votes.entrySet().iterator();
        String index="";
        int maxVote=0;
        String key;
        int value;
        while(totalVotes.hasNext()){
            Map.Entry mapE1=(Map.Entry)totalVotes.next();//fetch the elements
            key=mapE1.getKey().toString();
            value=(int)mapE1.getValue();
            if(value>maxVote){
                maxVote=value;
                index=key;
                            }
        }
        winner="Winner is... "+ index+" with total "+maxVote + " votes ";
        return winner;
    }
}
