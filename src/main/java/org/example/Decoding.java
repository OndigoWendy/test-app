public class Decoding {
    private  String inputText;
    private int shiftKey;
    public Decoding(int shiftKey, String inputText) {
        this.inputText=inputText;
        this.shiftKey=shiftKey;
    }

    public String decode() {
        String decoded = " ";
        char decodedArray[]=this.inputText.toCharArray();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i=0;i<decodedArray.length;i++){
            int singleAlphabet = inputText.charAt(i);
           // int charPosition = alphabet.indexOf(singleAlphabet);
          //  int x = charPosition-shiftKey;

            if (inputText.charAt(i) == ' ') {
                decoded += " ";
            }
            else  {
                int charPosition = alphabet.indexOf(inputText.charAt(i));
                int key = (charPosition-shiftKey)%26;
                if(key<0){
                    key=alphabet.length()+key;
                }

                decoded += alphabet.charAt(key);
            }
        }


        return decoded.toUpperCase();
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
