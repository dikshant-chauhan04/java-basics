public class ArrayRotation {
    //Time complexity O(n*d);
    public static void main(String[] args) {

        int [] arr = {1,24,55,66,33,45,12,2,4,5};
        int d = 3;
        int [] temp = new int[d];

        for(int i =0;i<d ; i++){
            temp[i] = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp[i];
        }





        for(int i =0;i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
