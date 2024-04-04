package week2;

public class ArrayExerciseKaiTak {
  public static void main(String[] args) {
    int[] arr1 = new int[] {100,14,0,5,9,2}; 
    //-------- i = 1
    //{14,100,0,5,9,2} j = 0
    //----- i = 2
    //{14,0,100,5,9,2} j = 1
    //{0,14,100,5,9,2} j = 0 
    // ------- i = 3
    //{0,14,5,100,9,2} j = 2
    //{0,5,14,100,9,2} j = 1
    //{0,5,14,100,9,2} j = 0
    //-------- i = 4
    //{0,5,14,9,100,2} j = 3
    //{0,5,9,14,100,2} j = 2
    //{0,5,9,14,100,2} j = 1
    //                   break j
    //--------------- i = 5
    //{0,5,9,14,2,100} j = 4
    //{0,5,9,2,14,100} j = 3
    //{0,5,2,9,14,100} j = 2
    //{0,2,5,9,14,100} j = 1
    //{0,2,5,9,14,100} j = 0

    // sort
    // 1. assume all the items are sorted except the last one (i.e. {0, 5, 9 ,14, 100, 2}).
    // 2. move the last item to a suitable place

  }
}
