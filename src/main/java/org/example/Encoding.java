//import  java.util.Scanner;
public class Encoding {
    private  String inputText;
    private int shiftKey;

    public Encoding(String inputText, int shiftKey) {
      this.inputText=inputText;
      this.shiftKey=shiftKey;
    }


    public String encode() {
            String encoded = " ";
            char encodedArray[]=this.inputText.toCharArray();
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            for(int i=0;i<encodedArray.length;i++){

                if (inputText.charAt(i) == ' ') {
                    encoded += " ";
                }
                else  {
                    int charPosition = alphabet.indexOf(inputText.charAt(i));
                    int key = (shiftKey+charPosition)%26;
                    encoded += alphabet.charAt(key);
                }
            }
            return encoded.toUpperCase();
        }


    public int shiftKey() {
        return shiftKey;
    }

    public String inputText() {
        return inputText;
    }

    public boolean isNotEmpty() {
        return true;
    }

    public boolean inputTextIsValid() {
        return true;
    }

    public boolean ShiftKeyIsValid() {
        return true;
    }
}


