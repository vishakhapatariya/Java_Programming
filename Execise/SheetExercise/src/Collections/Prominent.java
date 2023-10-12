/* 3) Write a java program to perform sorting on ProminentTrainee.  ProminentTrainee class have
    member variables/properties like TraineeId, TraineeName, TraineeAge, TraineeDOB.
    Create 10 ProminentTrainee objects and store it in list. Sort elements based on all the four
    members and print it. */

package Collections;

import java.util.ArrayList;
import java.util.Collections;

class ProminentTrainee implements Comparable {
    public int traineeId;
    public String traineeName;
    public int traineeAge;
    public String traineeDOB;

    public ProminentTrainee(int traineeId, String traineeName, int traineeAge, String traineeDOB) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeAge = traineeAge;
        this.traineeDOB = traineeDOB;
    }

    @Override
    public int compareTo(Object o) {
        ProminentTrainee pt = (ProminentTrainee) o ;
        if(this.traineeId<pt.traineeId)
            return -1;
        else if(this.traineeId>pt.traineeId)
            return 1;
        else
            return 0;
    }
}

public class Prominent {
    public static void main(String[] args) {
        ArrayList<ProminentTrainee> list = new ArrayList<>();
        list.add(new ProminentTrainee(1,"A",20,"05/02/2003"));
        list.add(new ProminentTrainee(2,"F",18,"09/04/2005"));
        list.add(new ProminentTrainee(8,"G",22,"28/01/2000"));
        list.add(new ProminentTrainee(6,"E",19,"13/06/2004"));
        list.add(new ProminentTrainee(4,"H",25,"26/09/1997"));
        list.add(new ProminentTrainee(3,"B",30,"11/07/1993"));
        list.add(new ProminentTrainee(9,"K",19,"30/04/2004"));
        list.add(new ProminentTrainee(10,"N",26,"22/08/1996"));
        list.add(new ProminentTrainee(5,"Y",31,"20/09/1992"));
        list.add(new ProminentTrainee(7,"Z",29,"10/10/1994"));

        // Sorting by ID
        Collections.sort(list);

        // Printing all elements
        for(int i=0;i<10;i++) {
            System.out.print("Trainee ID : "+list.get(i).traineeId);
            System.out.print(", Name : "+list.get(i).traineeName);
            System.out.print(", Age : "+list.get(i).traineeAge);
            System.out.print(", DOB : "+list.get(i).traineeDOB);
            System.out.print("\n");
        }
    }
}