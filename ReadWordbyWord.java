public class ReadWordbyWord {
    public static void main(String[] args){
        String text = "Umm AlQura University";
        for (String word : text.split(" "))
                System.out.println(word);
    }
}
