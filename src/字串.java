public class 字串 {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);

        String str = sc.next();
        char symbol = sc.next().charAt(1);

        String newstr = str.replace(symbol,'\n');
        System.out.println(newstr);
        }
}
