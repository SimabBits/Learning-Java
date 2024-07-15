
import java.util.Scanner;

public class RatatedArray{

static int pivotELement(int[] arr){

int s = 0;
int e = arr.length - 1;

while(s<e){

int mid =  s + (e - s)/2;

if(arr[mid] > arr[mid + 1]){

return mid;

}else if (arr[mid] > arr[e] ){
s = mid + 1;
}
else{

e = mid - 1;

}

}
return -1;
}

static int  binarySearch(int[] arr, int s, int e, int target){

while (s <= e){
int mid = s + (e - s)/2;

if (arr[mid] ==  target)
{

  return mid;

}

else if(arr[mid] < target)

s = mid + 1;

else

e = mid - 1;


}

return -1;

}

public static void main (String[] args){

Scanner sc = new Scanner(System.in);

int [] array = { 4, 5, 6, 0, 2, 3};

System.out.println("Enter the target element");

int target = sc.nextInt();

int pivot =  pivotELement(array);

int index = -1;

if(array[pivot] >= target && array[0] <= target){

  index =  binarySearch(array, 0, pivot, target);

}else{

  index = binarySearch(array, (pivot + 1), (array.length -1), target);

}

System.out.println( index != -1?"Element found at index"+ index: "Element not found");

sc.close();

}

}