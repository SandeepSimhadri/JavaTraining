public class test {
    void febonicce(int n){
        int n1=0,n2=1;
        int n3;
        for(int i=2;i<=n;i++){
            System.out.println(n1);
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args){
        test feb = new test();
        feb.febonicce(10);
    }
}
