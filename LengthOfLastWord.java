public class LengthOfLastWord {

    public static void main(String[] args) {
        String text = "a ";
        char[] array = text.toCharArray();
        int length = 0;
        boolean shouldRepeat = true;
        int currentIndex = text.length()-1;
        if(text.length() == 1){
            System.out.println("1");
        }
        while (array[currentIndex] == ' ') {
            currentIndex--;
        }
        while (currentIndex>=0 && array[currentIndex] != ' ') {
            length++;
            currentIndex--;
        }

        System.out.println(length);

    }
}
