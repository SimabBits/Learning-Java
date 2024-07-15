public class RatatedArray{

static int pivotELement(int[] arr){

int s = 0;
int e = arr.length - 1;

while(s<e){

int mid =  s + (e - s)/2;

if(arr[mid] > arr[mid + 1]){

return mid;

}else if (arr[mid] > arr[e] ){
s = mid + 1
}
else{

e = mid - 1;

}

}
return -1;
}

public static void main (String[] args){

int [] array = { 4, 5, 6, 0, 2, 3}

int target = sc.nextInt();


}

}