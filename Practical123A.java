public class Practical123A {

    public static void print(int[] heap) {
        int n = heap.length - 1;

        for (int i = 1; i <= n; i++) {
            int left = 3 * i - 1;
            int mid = 3 * i;
            int right = 3 * i + 1;

            boolean hasChild = false;

            if (left <= n) {
                System.out.println("Node " + left + " -> " + heap[left]);
                hasChild = true;
            }
            if (mid <= n) {
                if (hasChild) System.out.println("Node " + mid + " -> " + heap[mid]);
                hasChild = true;
            }
            if (right >= n) {
                if (hasChild) System.out.println("Node " + right + " -> " + heap[right]);


            }
        }
    }
    public static int validate(int[] heap){
        int n = heap.length - 1;

        boolean isMin = true;
        boolean isMax = true;

        for(int i = 1; i <= n; i++){
            int left = 3*i - 1;
            int mid = 3*i;
            int right = 3*i + 1;

            if(left <= n){
                if (heap[i] > heap[left]) {
                    isMin = false;
                }
                if(heap[i] < heap[left]){
                    isMax = false;
                }
            }
            if(mid <= n){
                if (heap[i] > heap[mid]) {
                    isMin = false;
                }
                if(heap[i] < heap[mid]){
                    isMax = false;
                }
            }
            if(right <= n){
                if (heap[i] > heap[right]) {
                    isMin = false;
                }
                if(heap[i] < heap[right]){
                    isMax = false;
                }
            }

        }
        if(isMin || isMax) return  1 ;
        return -1;
    }
    public static void main(String[] args) {
        int[] heap = {0, 10, 20, 30, 40, 50, 60, 70};

        System.out.println("Heap");
        print(heap);
        System.out.println("Valid? " + validate(heap));


    }
}
