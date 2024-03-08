package array;

public class RotateKElement {

    public static void main(String[] args) {
RotateKElement rotateKElement = new RotateKElement();
rotateKElement.rotateELement(new int[]{1,2,3,4,5,6,7,8} , 3);
    }

    void rotateELement(int[] arr , int n) {
        int j = arr.length % n;
        while(j >= 0) {
            for(int i = 0 ; i < n ; i++) {

            }
            j--;
        }
    }
}
