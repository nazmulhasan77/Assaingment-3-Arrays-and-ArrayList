
public class InitializesAnArray {
    public int[] a ;
    public int l;

    public InitializesAnArray(int[] a,int l) {
        this.a = a;
        this.l=l;
    }
    int i;
    public void evenIndex()
    {
        for(i=0;i<l;i++)
        {
            if(i%2==0)
            {
                System.out.printf("%d ",a[i]);
            }
        }
        System.out.println();
    }
    public void evenElement()
    {
        for(i=0;i<l;i++)
        {
            if(a[i]%2==0)
            {
                System.out.printf("%d ",a[i]);
            }
        }
        System.out.println();
    }
    public void reverseArray()
    {
        for(i=l-1;i>=0;i--)
        {
            System.out.printf("%d ",a[i]);
        }
        System.out.println();
    }
    public void fastAndLastElement()
    {
        System.out.printf("%d %d\n",a[0],a[a.length-1]);
    }


}