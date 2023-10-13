/* 3) Write a program to perform below operations
 - Create new arrayList, add custom objects of ProminentTrainee class. Class has
 TraineeId, TraineeName, TraineeAge, TraineeDOB properties
 - Iterate through the arrayList and print it using for loop, foreach loop and lambda expression.
 - Count element of a list using lambda expression
 - Insert element into the array list at the second position
 - Retrieve an element of 3rd index and print it
 - Print element whose TraineeId is 5 with the help of lambda
 - Convert list to set and count total element of set
 - Sort list based on all the four properties. Use lambda expression and functional interface
 - Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
 - Write all the records into plain text files. Record separator should be new line and field separator tab.
 - Read above created file. store all the records as a ProminentPixel and store it in list
Write all the records into binary files and read it back to list. */

package Lambda;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

interface MyLambda {
    public void print();
}

class ProminentTrainee2 {
    public int traineeId;
    public String traineeName;
    public int traineeAge;
    public String traineeDOB;

    public ProminentTrainee2(int traineeId, String traineeName, int traineeAge, String traineeDOB) {
        this.traineeId = traineeId;
        this.traineeName = traineeName;
        this.traineeAge = traineeAge;
        this.traineeDOB = traineeDOB;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        ArrayList<ProminentTrainee2> arrList = new ArrayList<>();
        arrList.add(new ProminentTrainee2(1, "A", 20, "05/02/2003"));
        arrList.add(new ProminentTrainee2(2, "F", 18, "09/04/2005"));
        arrList.add(new ProminentTrainee2(7, "G", 22, "28/01/2000"));
        arrList.add(new ProminentTrainee2(5, "E", 19, "13/06/2004"));

        // Iterate through the arrayList and print it using for loop, foreach loop and lambda expression.
        System.out.println("ArrayList printing using for loop : ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Trainee ID : " + arrList.get(i).traineeId);
            System.out.print(", Name : " + arrList.get(i).traineeName);
            System.out.print(", Age : " + arrList.get(i).traineeAge);
            System.out.print(", DOB : " + arrList.get(i).traineeDOB);
            System.out.print("\n");
        }

        System.out.println("ArrayList printing using forEach loop : ");
        for (ProminentTrainee2 a : arrList) {
            System.out.print("Trainee ID : " + a.traineeId);
            System.out.print(", Name : " + a.traineeName);
            System.out.print(", Age : " + a.traineeAge);
            System.out.print(", DOB : " + a.traineeDOB);
            System.out.print("\n");
        }

        System.out.println("ArrayList printing using Lambda Expression : ");
        arrList.forEach((a) -> {
            System.out.print("Trainee ID : " + a.traineeId);
            System.out.print(", Name : " + a.traineeName);
            System.out.print(", Age : " + a.traineeAge);
            System.out.print(", DOB : " + a.traineeDOB);
            System.out.print("\n");
        });

        // Count element of a list using lambda expression
        System.out.println("Count element of a list using lambda expression");
        MyLambda ml = () -> System.out.println("Count : " + arrList.size());
        ml.print();

        // Insert element into the array list at the second position
        arrList.add(1, new ProminentTrainee2(10, "B", 19, "20/02/2004"));

        // Retrieve an element of 3rd index and print it
        System.out.println("Retrieve an element of 3rd index and print it");
        System.out.print("ID : " + arrList.get(3).traineeId);
        System.out.print(", Name : " + arrList.get(3).traineeName);
        System.out.print(", Age : " + arrList.get(3).traineeAge);
        System.out.print(", DOB: " + arrList.get(3).traineeDOB);

        // Print element whose TraineeId is 5 with the help of lambda
        System.out.println("\nPrint element whose TraineeId is 5 with the help of lambda");
        MyLambda m = () -> {
            for (int i = 0; i < arrList.size(); i++) {
                if (arrList.get(i).traineeId == 5) {
                    System.out.print("ID : " + arrList.get(i).traineeId);
                    System.out.print(", Name : " + arrList.get(i).traineeName);
                    System.out.print(", Age : " + arrList.get(i).traineeAge);
                    System.out.print(", DOB: " + arrList.get(i).traineeDOB);
                }
            }
        };
        m.print();

        // Convert list to set and count total element of set
        System.out.println("Convert list to set and count total element of set");
        Set<ProminentTrainee2> set = new HashSet<>();
        for (ProminentTrainee2 x : arrList) {
            set.add(x);
        }
        System.out.println("Total elements of set : " + set.stream().count());


        // Sort list based on all the four properties. Use lambda expression and functional interfac
        Collections.sort(arrList, (o1, o2) -> (o1.traineeId > o2.traineeId) ? 1 : (o1.traineeId < o2.traineeId) ? -1 : 0);

        System.out.println("ArrayList printing using for loop : ");
        for (int i = 0; i < 4; i++) {
            System.out.print("Trainee ID : " + arrList.get(i).traineeId);
            System.out.print(", Name : " + arrList.get(i).traineeName);
            System.out.print(", Age : " + arrList.get(i).traineeAge);
            System.out.print(", DOB : " + arrList.get(i).traineeDOB);
            System.out.print("\n");
        }


        // Convert list to map using lambda expression. Keep TraineeId as Map key and ProminentTrainee as a map value
        MyLambda m2 = () -> {
            Map<Integer, ProminentTrainee2> map = new HashMap<>();
            for (int i = 0; i < arrList.size(); i++) {
                map.put(arrList.get(i).traineeId, arrList.get(i));
            }
        };
        m2.print();

        // Write all the records into plain text files.
        // Record separator should be new line and field separator tab
        try {
            FileOutputStream fo = new FileOutputStream("src/Lambda/Demo.txt");
            FileInputStream fi = new FileInputStream("src/Lambda/Demo.txt");

            for (int i = 0; i < arrList.size(); i++) {
                fo.write((+arrList.get(i).traineeId + "\t").getBytes());
                fo.write((arrList.get(i).traineeName + "\t").getBytes());
                fo.write((arrList.get(i).traineeAge + "\t").getBytes());
                fo.write((arrList.get(i).traineeDOB + "\n").getBytes());
            }

            // Read above created file. store all the records as a ProminentPixel and store it in list
            byte[] b = new byte[fi.available()];
            fi.read(b);
            String s = new String(b);
            System.out.println(s);

        } catch (Exception e) {
        }
    }
}