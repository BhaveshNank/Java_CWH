public class CWH_ch6_PS05 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);

        int temp;
        for (int i=0; i<n; i++){
            // Logic:
            // swap a[i] and a[i-1-i]
            // we have two containers |3| |4| in which 3 & 4 are stores 
            // we need a temporary container to do swaping: let temp be the container
            // |3| |4| temp = | | first we take 3 and put it in temp 
            // | | |4| temp = |3|
            // then we take 4 and put it where 3 was previously |4| | |  temp = |3|
            // then we put the 3 from temp container into where 4 was 
            // |4| |3| temp = | |; swapping done
            
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }

        }
        

    }

