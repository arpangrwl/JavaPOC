
// Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

// For example,
// Given [[0, 30],[5, 10],[15, 20]],
// return false.

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */


package Interview.Sort;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MeetingRoomTimeSort {

    int start[];
    int end[];

    public int[] getStart() {
        return start;
    }

    public void setStart(int[] start) {
        this.start = start;
    }

    public MeetingRoomTimeSort(int[] start, int[] end) {
        this.start = start;
        this.end = end;
    }
    MeetingRoomTimeSort(){

    }

    public int[] getEnd() {

        return end;
    }

    public void setEnd(int[] end) {
        this.end = end;
    }

    public static void main(String[] args) {
       String input = "[[0, 30],[5, 10],[15, 20]]";
       JSONArray jsonArray = (JSONArray) new JSONObject(new JSONTokener("{data:"+input+"}")).get("data");


        for(Object obj : jsonArray)
        {
            ArrayList<Object> qw = new ArrayList<Object>((Collection<?>)obj);

        }

        MeetingRoomTimeSort mr = new MeetingRoomTimeSort();
        Iterator<Object> itr = jsonArray.iterator();
        while(itr.hasNext()){

            int abc[] = (int[]) itr.next();
            mr.setStart(abc);
        }


      //


    }
}


