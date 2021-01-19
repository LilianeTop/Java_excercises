package Regex;

public class ExerciseSplit {
    public static void main(String[] args) {
        String phoneNumber = "+123(234)123-12.34";
        String[] phoneNumberSplit = phoneNumber.split("[+ |( | ) | -]");
        //removes all digits except the "."
        String phone = phoneNumber.replaceAll("[^\\d.]", "");
        //removes all digits
        String phone2 = phoneNumber.replaceAll("[^\\d]", "");
        System.out.println(phone2);
        System.out.println("string phone " + phone);
        for (int i = 0; i < phoneNumberSplit.length; i++) {
            System.out.print(phoneNumberSplit[i]);

        }
        //name = name.replaceAll("[\\p{Punct}&&[^_-]]+", "");
    String content = "abs:I;don't!want:that:this'will'work";
        String[] words = content.split("[\\P{L}&&[^']]+");
                for(String word : words) {
                    System.out.println(word);
                }

    }
}
