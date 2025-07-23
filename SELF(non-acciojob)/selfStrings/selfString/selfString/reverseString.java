
public class reverseString{
    public static void main(String[] args) {
            String name = "Ara".toLowerCase();
            int i=0;
            boolean flag = true;
            while(i<name.length()){
                char ch1 = name.charAt(i);
                char ch2 = name.charAt(name.length()-1-i);
                if(ch1!=ch2){
                    flag = false;
                    break;
                }
                i++;
            }
			if(flag) System.out.println("It is Palindrome");
			else System.out.println("It is not Palindrome");
    }
}