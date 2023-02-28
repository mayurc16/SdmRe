//Update java file with any 5 String method with switch case and call 
commit
class StringMethods
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str="Cdac Mumbai";
        int x= sc.nextInt();
        do{
        switch (x)
        {
            case 1: System.out.println (str.substring (0, str.length()-1));
                    break;
            case 2: System.out.println (str.length());
                    break;
            case 3: System.out.println (str.split (" "));
                    break;
            case 4: System.out.println (str.toUpperCase ());  
                    break;
            case 5: System.out.println (str.toLowerCase ());  
                    break;
            case 6: System.out.println (str.toLowerCase ());  
                    break;
            default: System.out.println("Wrong choice");
        }
        }while(x!=0);
    }
}