class Array_User
{
  public static void main(String args[])
  {
   int ary[];
    ary=new int[4];

   ary[0]=1;
   ary[1]=2;
   ary[2]=3;
   ary[3]=4;

   for(int i=0;i<ary.length;i++)
   {
    System.out.println("Element at index: "+i+" :: "+ary[i]);
   }
   
  }
}