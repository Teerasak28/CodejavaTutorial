public class calscore {
    public void  calculate(){
        double score = Math.random()*100;
        System.out.println("score is " +score);
        if(score >= 80){
            System.out.println("grad is A");
        }else if (score >= 70) {
            System.out.println("grad is B");
        }else{
            System.out.println("grad is C");
        }
    }
}
