public class GitHubKrakenDemo implements Runnable
{

    public static void main (String[] args)
    {
        Thread[] t = new Thread[1000];
        for (int i = 0; i < t.length; i++)
        {
            t[i] = new Thread(new GitHubKrakenDemo());
        }
    }

    @Override
    public void run() {

    }
}
