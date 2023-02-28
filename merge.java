class Merge
{
    public static void main(String[] args)  
    {
        int arr1[]= {1,2,3,4,5,6,7,8};
        int arr2[]={9,8,7,6,5,4,3,2,1};
        int arr3[]=new int [arr1.length+arr2.length ];
        int i=0;
        for(i=0;i<arr1.length;i++)
        {
            arr3[i]= arr1[i];
        }
        for(int j=0;j<arr2.length;i++,j++) 
        {
            arr3[i]= arr2[j];
        }
    }
}