package com.cdac;
public class array {
	int count;// no of elements present in array
	int[] arr;//Declaration of array
	int capacity;//total memory for elements
	public array()
	{
		capacity=5;
		arr=new int[capacity];
		count=0;
	}
	public array(int c)
	{
		capacity=c;
		arr=new int[capacity];
		count=0;
	}
	
	public void add(int x)
	{
		if(count<capacity)
		{arr[count]=x;
		count++;
		}
		else
		{
			System.out.println("cannot insert new elements");
		}
	}
	
	public void display()
	{
		System.out.print("[ ");
		for(int i=0; i<count;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println(" ]");
	}
	public int size()
	{
		return count;
	}
	public void delete()
	{
		if(count!=0)
		{
			arr[count]=0;
		count--;
		}
		else
		{
			System.out.println("cannot delete array empty");
		}
	}
}
