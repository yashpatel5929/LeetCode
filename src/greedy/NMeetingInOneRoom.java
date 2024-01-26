package greedy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class  meeting {

    int start;
    int end;
    int pos;
    meeting(int start ,int end ,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class MeetingComparator implements Comparator<meeting>{

    @Override
    public int compare(meeting o1, meeting o2) {
        if(o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1;
    }
}
public class NMeetingInOneRoom {
    public static void main(String[] args) {
     NMeetingInOneRoom m = new NMeetingInOneRoom();
     int[] start = new int[]{10, 12, 20};
     int[] end = new int[]{20, 25, 30};
     int n = start.length;
     int val = maxMeetings(start,end,n);
     System.out.println(""+val);
    }

    public static int maxMeetings(int start[], int end[], int n)
    {

        ArrayList<meeting> meetings = new ArrayList<>();

        for(int i=0 ; i< start.length ; i++) {
            meetings.add(new meeting(start[i] , end[i] , i+1));
        }

        MeetingComparator com = new MeetingComparator();
        Collections.sort(meetings , com);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meetings.get(0).pos);
        int endLimit = meetings.get(0).end;


        for(int i=1 ; i < start.length ; i++){
            if(meetings.get(i).start > endLimit){
                ans.add(meetings.get(i).pos);
                endLimit = meetings.get(i).end;
            }
        }

        return ans.size();
    }
}
