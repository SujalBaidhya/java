class exc
{
     public static void main(String[] args) {

        // try{
        //     int a=x/0;
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println(e.getMessage());
        //     e.printStackTrace();
        // }
        int arr[]={1,2,3};
        try{
            arr[4]=5;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        
    }
}