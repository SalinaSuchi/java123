 class Pattern
{
    public static void main(String[] args)
    {
        int alphabet = 65;

      
        int n=5,j;
        for (int i = 0; i <n; i++)
        {
            for (j=2*(n-i); j>=0; j--)
            {
                System.out.print(" ");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print((char) alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}