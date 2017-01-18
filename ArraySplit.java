import java.util.*;

public class Solution {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String size = "";
        String array = ""; 
        String wanX = "";
        // arraylist to hold the int arrays
        ArrayList<int[]> res = new ArrayList<int[]>();
        // iterate through input to get the size of the array and x
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '['){
                while(s.charAt(i+1) != ']'){
                    size += s.charAt(i+1);
                    i++;
                }
            }
            // get x 
            if(s.charAt(i) == 'x'){
                while(i+2 != s.length()){
                    wanX += s.charAt(i+2);
                    i++;
                }
            }
        }
        // iterate through input to get the array
        for(int j = 0; j < s.length(); j++){ 
            int o = 0;
            if(s.charAt(j) == '{'){
                while(s.charAt(j+1) != '}'){
                    array += s.charAt(j+1);
                    j++;  
                }
            }
        }
        // split string "array" to get single ints 
        String[] strArr = array.split(",");
        int o = 0;
        int c = 0;
        // parse x and size from corresponding strings
        int x = Integer.parseInt(wanX);
        int n = Integer.parseInt(size); 
         // array to hold the given array
        int arr[] = new int[n-1];
        // populate arr with elements from strArr
        for(String num : strArr){
            arr[o] = Integer.parseInt(num);
            o++;
        }
        // iterate through arr 
        for(int y = 0; y < arr.length;y++){
            int u = 0; 
            // get the size of every single array "c"
            while(arr[y] != x){
                c++;
                y++;
                if(y+1 == arr.length){
                    c++;
                    y++;
                    break;
                }
            }
            // create new array with size "c"
            int [] fol = new int[c];
            for(int h = y - c; h < y; h++){
                    // populate fol with wanted elements from arr
                    for(int w = 0; w < c;w++){
                        fol[w] = arr[h];
                        h++;
                    }
                    // add fol to the ArrayList
                    res.add(fol);
            }
            c=0;
        }
        int p = 1;
        // print the arrays in the ArrayList
        for(int [] ar : res){
            System.out.println("Arr"+p+"="+Arrays.toString(ar));
            p++;
        }
    }
}