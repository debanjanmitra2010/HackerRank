import java.util.ArrayList; 
// Using Sieve of Eratosthenes Approach
public class nPrime  
{     
static int MAX_SIZE = 1000005;  
//creating an instance of the ArrayList class that stores all the prime numbers  
static ArrayList<Integer> primelist = new ArrayList<Integer>();  
//defining a static function to find the nth prime number using Sieve of Eratosthenes approach  
static void findnthPrimeNumber()   
{   
//creating a boolean array and marking all entries as true  
//the value IsPrime[i] will be false if i is not a IsPrime  
boolean [] IsPrime = new boolean[MAX_SIZE];   
for(int i = 0; i < MAX_SIZE; i++)  
IsPrime[i] = true;  
for (int p = 2; p * p < MAX_SIZE; p++)   
{   
// If IsPrime[p] is not changed,   
// then it is a prime   
if (IsPrime[p] == true)   
{   
//finds the multiples of p greater than or equal to the square of it  
//we have already marked the numbers that rae multiple of p and are less than p to the power 2   
for (int i = p * p; i < MAX_SIZE; i += p)   
IsPrime[i] = false;   
}   
}   
for (int p = 2; p < MAX_SIZE; p++)   
if (IsPrime[p] == true)   
//adding prime number to the ArrayList  
primelist.add(p);  
}   
// Driver Code  
public static void main (String args[])   
{  
//calling the static function  
findnthPrimeNumber();  
//get() method returns the specified position in this list  
System.out.println("7th prime number is " + primelist.get(6));  
System.out.println("22nd prime number is " + primelist.get(21));  
System.out.println("10000th prime number is " + primelist.get(9999));  
}  
}   
