package p1;

public class BinarySearch {
    static int[] intList = {1,5,6,7,8,10,15,16,20,30,40,50,60,100};
    static int binarySearch(int[] list, int key){
        int firstIndex = 0;
        int finalIndex = list.length -1;
        while (finalIndex >= firstIndex) {   ///// If key > list and key out of the list, while stop and return -1///
            int midIndex = (firstIndex + finalIndex) / 2 ;
            if (key < list[midIndex]){
                finalIndex = midIndex - 1;
            } else if (key > list[midIndex]) {
                firstIndex = midIndex + 1;
            } else return midIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(intList,20));
        System.out.println(binarySearch(intList,100));
        System.out.println(binarySearch(intList,1000));
    }
}
