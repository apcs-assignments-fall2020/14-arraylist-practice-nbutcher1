import java.util.ArrayList;

public class MyMain {

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) { 
        int counter = 0;
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i) % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) { 
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j ++) {
                if(list1.get(i) == list2.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    public static ArrayList<Integer> convertToArrayList(int[] arr) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
