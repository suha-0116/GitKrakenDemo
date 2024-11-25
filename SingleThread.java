public class SingleThread
{
    public static void main (String [] args)
    {
        long startTime = System.currentTimeMillis();
        int count =0;
        for(int i=0; i<1000000000; i++)
        {
            count++;
        }
        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println(count );
        System.out.println(totalTime + " ms");
    }

    //The multi-thread solution is slower because the task is very simple and creating and destroying the threads
    //causes overhead. 

}
