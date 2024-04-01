public class ElMasGrande {
    //writte a method to return the largest on an array
    public static int largest(int[] array){
      int largest = Integer.MIN_VALUE;
      //check empty array thorw an exception
      if(array.length == 0){
        throw new IllegalArgumentException("Empty array");
      }
      for(int i = 0; i <= array.length-1; i++){
        if(array[i] > largest){
          largest = array[i];
        }
      }
      return largest;
  }
}
