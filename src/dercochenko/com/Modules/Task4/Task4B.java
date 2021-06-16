package dercochenko.com.Modules.Task4;

import java.util.Arrays;

public class Task4B {
    public static void main(String[] args) {
        String text = "Hello, user! How are you?";


        System.out.println("1)" +" "+  TextEditor.addStringInEndLine(text, "Fine!"));
        System.out.println("2)" +" "+  TextEditor.insertWordInText(text, text.indexOf(' '), "dear"));
        System.out.println("3)" +" "+  TextEditor.deleteChar(text, '!'));
        System.out.println("4)" +" "+  text.replace("user","programmer"));
    }

}

class TextEditor {
    public static String addStringInEndLine(String text, String str) {
        return text + str;
    }

    public static String insertWordInText(String text, int index, String str) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.insert(index, str).toString();
    }
    public static String deleteChar(String text, char symbol){
        StringBuilder newText = new StringBuilder();

        for (int i =0;i<text.length();i++){
            if(text.charAt(i) != symbol){
                newText.append(text.charAt(i));
            }
        }
        return newText.toString();
    }
}
