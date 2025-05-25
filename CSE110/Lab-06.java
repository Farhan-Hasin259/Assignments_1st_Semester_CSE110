import java.util.Scanner;
public class Task01 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Please Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;
}
int [] newArray = new int [n+1];
System.out.println( &quot;Enter Another Number :&quot; );
newArray [n] = sc.nextInt();
System.out.println( &quot;The Elements Of The Array Are:&quot; );
for (int index = 0 ; index &lt; n ; index++){
System.out.println( index +&quot; : &quot;+array[index] );
}
for (int i = 0 ; i&lt;n ;i++){
newArray [i] = array [i];
}

System.out.println( &quot;After Resizing The Array :&quot; );
for (int j = 0 ; j&lt;n+1 ; j++){
System.out.print( newArray[j] + &quot; &quot; );
}
}
}

import java.util.Scanner;
public class Task02 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
int [] arr = {9,-5,7,9,-5,5,7} ;
System.out.println( &quot;Before Removing Duplicates: &quot; );
for (int index = 0 ; index &lt; arr.length ; index++){
System.out.print( arr[index] + &quot; &quot; );
}
System.out.println();
for (int i = 0 ; i &lt; arr.length ; i++){
for (int j = i+1 ; j &lt; arr.length ; j++){
if ( arr[i] == arr[j] ){
arr[j]=0;
}

}
}
System.out.println( &quot;After Replacing Duplicates With 0 : &quot; );
for (int index = 0 ; index &lt; arr.length ; index++){
System.out.print( arr[index] + &quot; &quot; );
}
}
}

import java.util.Scanner;
public class Task03a {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
int [] newArray = new int [n+1];
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Please Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;
}

System.out.println( &quot;Reversed Using A New Array :&quot; );
for (int index = 0 ; index &lt; n ; index++){
newArray [index] = array [n - 1 - index];
System.out.print( newArray [index] + &quot; &quot; );
}
}
}

import java.util.Scanner;
public class Task03b {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Please Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;
}
System.out.println( &quot;Reversed Without Using A New Array :&quot; );
for (int index = 0 ; index &lt; n / 2 ; index++){

int store = array[index];
array[index] = array[n-1-index];
array[n-1-index] = store ;
}
for (int index = 0; index &lt; n; index++) {
System.out.print(array[index] + &quot; &quot;);
}
System.out.println();
}
}

import java.util.Scanner;
public class Task04 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Please Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;

}
System.out.println( &quot;Original Array :&quot; );
for (int index = 0 ; index &lt; n ; index++){
System.out.print( array [index] + &quot; &quot; );
}
for (int index = 0 ; index &lt; n ; index++){
if (array [index] &gt;= 0){
array [index] = 1 ;
}
else {
array [index] = 0 ;
}
}
System.out.println( &quot;&quot; );
System.out.println( &quot;After Modifing :&quot; );
for (int index = 0 ; index &lt; n ; index++){
System.out.print( array [index] + &quot; &quot; );
}
}
}

import java.util.Scanner;

public class Task05 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
Boolean flag = false ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;
}
System.out.println( &quot;Enter Another Number&quot; );
int numm = sc.nextInt();
for (int index = 0 ; index &lt; n ; index++){
if ( numm == array [index] ){
System.out.println( numm + &quot; Is At Index &quot; + index );
flag = true ;
break ;
}
}
if ( flag == false ){

System.out.println( &quot;Element Not Found&quot; );
}
}
}

import java.util.Scanner;
public class Task06 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
double [] array = new double [n] ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Enter A Number&quot; );
double num = sc.nextDouble();
array[index] = num ;
}
double max = array[0];
double min = array[0];
int maxIndex = 0;
int minIndex = 0;
double sum = 0;

for (int index = 0 ; index &lt; n ; index++){
if ( array [index] &gt; max ){
max = array[index];
maxIndex = index ;
}
if ( array [index] &lt; min ){
min = array[index];
minIndex = index ;
}
sum = sum + array [index];
}
double avg = sum / n ;
System.out.println(&quot;Maximum Element &quot; + max + &quot; Found At Index &quot; + maxIndex);
System.out.println(&quot;Minimum Element &quot; + min + &quot; Found At Index &quot; + minIndex);
System.out.println(&quot;Summation Value: &quot; + sum);
System.out.println(&quot;Average: &quot; + avg);
}
}

import java.util.Scanner;
public class Task07 {
public static void main(String [] args){

Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The Array&quot; );
int n = sc.nextInt();
int [] array = new int [n] ;
for (int index = 0 ; index &lt; n ; index++){
System.out.println( &quot;Please Enter A Number&quot; );
int num = sc.nextInt();
array[index] = num ;
}
System.out.println( &quot;Input Array :&quot; );
for (int index = 0 ; index &lt; n ; index++){
System.out.print( array [index] + &quot; &quot; );
}
System.out.println();
int [] newArray = new int[n];
int counter = 0;
for (int i = 0; i &lt; n; i++) {
boolean flag = true;
for (int j = 0; j &lt; counter; j++) {
if (array[i] == newArray[j]) {
flag = false;
break;

}
}
if (flag == true) {
newArray[counter] = array[i];
counter++;
}
}
int[] finalArray = new int[counter];
for (int i = 0; i &lt; counter; i++) {
finalArray[i] = newArray[i];
}
System.out.println(&quot;New Array: &quot;);
for (int i = 0; i &lt; counter; i++) {
System.out.print(finalArray[i] + &quot; &quot;);
}
}
}

public class Task07alt {
public static void main(String[] args) {
int[] arr = {23, 100, 23, 56, 100};

System.out.println(&quot;Input array: &quot;);
for (int index = 0 ; index &lt; arr.length ; index++) {
System.out.print( arr [index] + &quot; &quot; );
}
System.out.println();
int[] newArray = new int[arr.length];
int counter = 0;
for (int i = 0; i &lt; arr.length; i++) {
boolean flag = true;
for (int j = 0; j &lt; counter; j++) {
if (arr[i] == newArray[j]) {
flag = false;
break;
}
}
if (flag == true) {
newArray[counter] = arr[i];
counter++;
}
}
int[] array = new int[counter];
for (int i = 0; i &lt; counter; i++) {

array[i] = newArray[i];
}
System.out.println(&quot;New Array: &quot;);
for (int i = 0; i &lt; counter; i++) {
System.out.print(array[i] + &quot; &quot;);
}
}
}

import java.util.Scanner;
public class Task08 {
public static void main(String [] args){
Scanner sc = new Scanner (System.in);
System.out.println( &quot;Please Enter The Length Of The First Array :&quot; );
int n1 = sc.nextInt();
int [] array1 = new int [n1] ;
System.out.println( &quot;Please Enter The Elements Of Array1:&quot; );
for (int index = 0 ; index &lt; n1 ; index++){
int num = sc.nextInt();
array1[index] = num ;
}
System.out.println( &quot;Please Enter The Length Of The Second Array :&quot; );

int n2 = sc.nextInt();
int [] array2 = new int [n2] ;
System.out.println( &quot;Please Enter The Elements Of Array2:&quot; );
for (int index = 0 ; index &lt; n2 ; index++){
int num2 = sc.nextInt();
array2[index] = num2;
}
Boolean flag1 = true ;
for (int index = 0 ; index &lt; n2 ; index++){
Boolean flag2 = true ;
for (int i = 0 ; i &lt; n1 ; i++){
if ( array2[index] == array1[i] ){
flag2 = false ;
break ;
}
}
if ( flag2 == true ){
flag1 = false ;
break ;
}
}
if( flag1 == true ){

System.out.println(&quot;Array 2 Is A Subset Of Array 1.&quot;);
}
else {
System.out.println(&quot;Array 2 Is Not A Subset Of Array 1.&quot;);
}
}
}