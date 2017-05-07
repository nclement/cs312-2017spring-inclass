
/**
 * Write a description of class ExamReview here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExamReview
{
    public static void main(String[] args) {
        String[] an = {"OAS", "IMS", "KJS"};
        int xn = 2;
        System.out.println(an[1].length() < 10 || an[an.length + xn] == an[0]);
        System.out.println(an[1].length() > 15 && an[512] == an[0]);
        //System.out.print(an[512] == an[0] && an[1].length() > 15);
        /*
        for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; i++) {
        System.out.println(i + " " + j);
        }
        }
         */
        String s0 = "volleyball";
        String s1 = "ball";
        String s2 = "ball";
        String s3 = s0.substring(6);
        String s4 = s0.substring(6);
        System.out.println("s3 is " + s3);
        System.out.println((s1 == s2) + " " + (s2 == s3) + " " + (s3.equals(s4)));
    }
}
