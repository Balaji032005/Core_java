package ashokk;

 class Add{
    public void sum() {
        int alpha = 1500;
        int beta = 150;
        int result = alpha + beta;
        System.out.println("The result:" + result);

    }
}
class sub extends  Add{
    public void substract()
    {
        int alpha=1500;
        int beta=150;
        int result=alpha-beta;
        System.out.println("The result:"+result);


    }
}


public class Single_Inheritance {

    public static void main(String[] args) {

        Add aa= new Add();
        aa.sum();
        sub ss= new sub();
        ss.substract();
        ss.sum();


    }
}

