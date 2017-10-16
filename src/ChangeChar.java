public class ChangeChar {
    public static void main(String[] args){
        java.util.Scanner sc=new java.util.Scanner(System.in);

        String str = sc.nextLine();

        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(str.replace(c1,c2));

    }
}
