package Challenges;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;


public class Permutation {
    public static void main(String[] args) {
        List<List<String>> records = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        //Asking name of csv file
        String str = s.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader("src\\Data\\"+str))) {
            //reading data from file line by line and storing it to string array
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            String arr[] = new String[3];
            for(int i=0;i<3;i++) {
                arr[i] = String.valueOf(records.get(i));
            }
            //printing the permutations of string of array of array
            for(int i=0;i<arr.length;i++) {
                String x = "";
                for(int j=0;j<arr[i].length();j++) {
                    if((arr[i].charAt(j)>='a'&&arr[i].charAt(j)<='z')||(arr[i].charAt(j)>='a'&&arr[i].charAt(j)<='z')) {
                        x = x + arr[i].charAt(j);
                    }
                }
                arr[i] = x;
            }
            for(int i=0;i<arr[0].length();i++) {
                for(int j=0;j<arr[1].length();j++) {
                    for(int k=0;k<arr[2].length();k++) {
                        System.out.print(arr[0].charAt(i)+""+arr[1].charAt(j)+""+arr[2].charAt(k));
                        System.out.print(", ");
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
