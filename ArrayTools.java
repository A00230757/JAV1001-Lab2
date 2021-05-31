/*Program Description

 ArrayTools.java It is a small command line application (ArrayTools.java) that provides useful tools to developers:

1.Caesar cipher method accepts a String (the String to encrypt), a shift value, and returns the new String.

2.arrayAvg Write a method that accepts an array and produces the average of all values (only numeric type values allowed )

3.arrayContains: It is  a method that accepts an array and a search value, and determines if the array contains the value 

4.reverse: It is  a method that reverses an array (gives a new array)
 */

/**
 *
 *  Student Name: Harpreet Singh , Student ID: A00230757
 */

import java.util.*;
public class ArrayTools {//class starts

public static void main(String args[]){// main function starts

Scanner scanner = new Scanner(System.in);

boolean continueProgram = true;//a type of flag  to stop while loop when user want to exit program

System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average (call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");

while(continueProgram){// runs till user press option 6 to exit

try{// to handle error in case data entered by user is not numeric 

int choice =scanner.nextInt();//when user enter 1-6 then value is stored in this variable

switch (choice){// switch case to decide which option user choosed

case 1:// if user choosed Caeser Cipher then this case runs
System.out.println("Caeser Cipher");
System.out.println("Enter original string to encrypt");
String originalString =scanner.next();//accept original string
System.out.println("Enter shift value in numeric only");
int shiftValue =scanner.nextInt();//accept shift value
String encryptedResult=caesarCipher(originalString,shiftValue);// call caesarCipher method and store encrypted value /returned value
System.out.println("Encrypted String:  "+encryptedResult);
String decryptedResult=caesarCipher(encryptedResult,-shiftValue);//(this time negative same shift value passed as argument . call caesarCipher method and store decrypted value /return value
System.out.println("Decrypting "+encryptedResult+" with -"+shiftValue+"  ...."+decryptedResult);
System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average(call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");
break;

//--------------------------if user choosed array average then this case runs
case 2:
System.out.println("array average");
System.out.println("enter size of array in numeric only");
int arraySizeOriginal=scanner.nextInt();
double originalArray[]=new double[arraySizeOriginal];
System.out.println("enter "+arraySizeOriginal+" elements of array , only numeric values accepted");

//--------------------to accept array values from user
for (int i=0;i<arraySizeOriginal;i++){
double element=scanner.nextDouble();
originalArray[i]=element;
}

//-------------------------------to display an  array entered by user
System.out.print("\nTesting methods with[");
for (int i=0;i<arraySizeOriginal;i++){
System.out.print(originalArray[i]);
if(i<arraySizeOriginal-1){
System.out.print(" ");
}
}
System.out.print("]\n");

//---------------------------------------------------------------call arrayAvg method and store average value returned by it
double average=arrayAvg(originalArray);
System.out.println("\nAverage of array elements is "+average);

//---------------------------------------------------------------arrayContains method called to search particular value in array entered by user
System.out.println("\nenter element to search in numeric value");
double searchItem= scanner.nextDouble();
boolean existOrNot=arrayContains(originalArray  , searchItem);
if(existOrNot){
System.out.println("\nArray contain "+searchItem);
}
else{
System.out.println("\nArray does not  contain "+searchItem);
}

//---------------------------------------------------------------call reverse method to reverse this array
double arrayAfterReversal[]=reverse(originalArray);
System.out.print("\nThe array reversed is  [");

for (int i=0;i<arraySizeOriginal;i++){// display reversed array
System.out.print(arrayAfterReversal[i]);
if(i<arraySizeOriginal-1){
System.out.print(" ");
}
}
System.out.print("]\n");

System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average(call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");
break;

//if user choosed option array contain then this case runs
case 3:
System.out.println("array contain");
System.out.println("enter size of array in numeric only");
int arraySizeOriginal2=scanner.nextInt();
double originalArray2[]=new double[arraySizeOriginal2];
System.out.println("enter "+arraySizeOriginal2+" elements of array , only numeric values accepted");

for (int i=0;i<arraySizeOriginal2;i++){//input array
double element=scanner.nextDouble();
originalArray2[i]=element;
}

System.out.print("\nTesting method with[");
for (int i=0;i<arraySizeOriginal2;i++){//display array entered by user
System.out.print(originalArray2[i]);
if(i<arraySizeOriginal2-1){
System.out.print(" ");
}
}
System.out.print("]\n");

System.out.println("\nenter element to search in numeric value");
double searchItem1= scanner.nextDouble();//input element user want to search
boolean existOrNot1=arrayContains(originalArray2  , searchItem1);//call the function arrayContains to chk whether tjis element present or not
if(existOrNot1){//display result based on boolean value returned by function
System.out.println("\nArray contain "+searchItem1);
}
else{
System.out.println("\nArray does not  contain "+searchItem1);
}

System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average(call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");
break;

//runs if user choosed option  array reverse
case 4:
System.out.println("array reverse");
System.out.println("enter size of array in numeric only");
int arraySizeOriginal3=scanner.nextInt();
double originalArray3[]=new double[arraySizeOriginal3];
System.out.println("enter "+arraySizeOriginal3+" elements of array , only numeric values accepted");

for (int i=0;i<arraySizeOriginal3;i++){//input array from user
double element=scanner.nextDouble();
originalArray3[i]=element;
}

System.out.print("\nTesting method with[");//display array entered by user
for (int i=0;i<arraySizeOriginal3;i++){
System.out.print(originalArray3[i]);
if(i<arraySizeOriginal3-1){
System.out.print(" ");
}
}
System.out.print("]\n");

double arrayAfterReversal1[]=reverse(originalArray3);//call function and store returned array by reverse function
System.out.print("\nThe array reversed is  [");//display reversed array
for (int i=0;i<arraySizeOriginal3;i++){
System.out.print(arrayAfterReversal1[i]);
if(i<arraySizeOriginal3-1){
System.out.print(" ");
}
}
System.out.print("]\n");

System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average(call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");
break;

//display main menu again 
case 5:
System.out.println("\ninput choice from 1-6\n1.Caesar Cipher\n2.array average(call array contain and reverse automatically)\n3.array contain\n4.array reverse\n5.main menu\n6.exit\n");
break;

//stop program by setting flag value false and while loop stops
case 6:
continueProgram= false;
System.out.println("\nprogram stopped , you can run again");
}//swith case ends

}

//display message in case user enter invalid input
catch(Exception ex){
System.out.println("\ninvalid input program stopped , enter only numeric data and run again");
break;
}

}//while loop ends

}//main function ends


//---------------------------caesarCipher method which accepts string value and shift value as parameters and return encrypted string
public static String caesarCipher(String inputString , int shiftValue)
{
int stringSize=inputString.length();
String encryptedString = "";// to store encrypted string
for( int i=0;i<stringSize;i++){
char singleCharacter=inputString.charAt(i);// to get single character in string
singleCharacter=(char)(singleCharacter+shiftValue);//here shift value is added to  make a shift of five in each  character of string
encryptedString=encryptedString+singleCharacter; //shifted characters embedded in final  string to return
}
return  encryptedString;
}


//--------------------------------------------------arrayAvg method accepts an array as a parameter and return double value(average of array elements)
public static double arrayAvg(double inputArray[])
{
int arraySize=inputArray.length;
double averageOfArrayElements=0.0;// to store average of all elements of array
double sumOfArrayElements =0.0;// to store sum of all elements of array

for( int i=0;i<arraySize;i++){
sumOfArrayElements +=inputArray[i];
}

averageOfArrayElements = sumOfArrayElements/arraySize;//find average after dividing sun of array elements to total no of elements
return  averageOfArrayElements;
}


//----------------------arrayContains method accepts double array and a value to search and return boolean true or false in case value is present or not after performing check
public static boolean arrayContains(double inputArray[] , double searchValue)
{
boolean containOrNot = false;//initially flag is false
int arraySize=inputArray.length;

for( int i=0;i<arraySize;i++){
if (inputArray[i] == searchValue){///if element present this if runs and value flag changes to true
containOrNot = true;
break;//stop for loop
}
}

return  containOrNot;
}


//-----------------reverse  method accepts a array and return an array after reversing it
public static double[] reverse(double inputArray[])
{
int arraySize=inputArray.length;

double reversedArray [] = new double[arraySize];//array in which elements of original array stored after reversing
int j=0;

for( int i=arraySize-1;i>=0;i--){//starts from last element of actual array and store reverse elements of inputArray in reversedArray  
reversedArray[j] =inputArray[i];
j++;
}
return reversedArray ;//return reversedArray
}
//----------------------

}//class ends
