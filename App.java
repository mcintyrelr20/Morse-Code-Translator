import java.util.Scanner;
//Liam R McIntyre
//Morse Code Translator

public class App 
{
    public static void main(String[] args) 
    {
        System.out.println("This program converts text to morse code. ");
        String text = getString(); // gets the text from the user. 
        String convert = morseCode(text);
        output(text, convert);
    }
    static void output(String userInput, String convertedString)
    {
        System.out.println(userInput + " converted to morse code is: " + convertedString);
    }
    static String getString()
	{
		System.out.println("Enter a string to convert it to morse code: ");
		Scanner scan = new Scanner(System.in); 
        String text = scan.nextLine();
        scan.close(); 
        return text;
	}
    static String morseCode(String text)
    {
        char[] textArray = text.toCharArray();
        int arrayLength = textArray.length; 
        String morseCodeConversion = "";
        for(int i = 0; i < arrayLength; i++ )
        {
            String morseLetter = morseCodeConvert(textArray[i]); // converts the letter into morse code. 
            morseCodeConversion = morseCodeConversion + morseLetter; // makes the converted string./ 
        }
        return morseCodeConversion; // returns the completed converted sentance or word. 
    }
    static String morseCodeConvert(char letter)
    {
        Character.toLowerCase(letter);
        String morseLetter = "";
        switch(letter) // converts the letter to morse code then adds it to a string.
        {
            case 'a':
            morseLetter = ".-";
            break; 

            case 'b':
            morseLetter = "-...";
            break; 

            case 'c':
            morseLetter = "-.-.";
            break;

            case 'd':
            morseLetter = "-.."; 
            break; 
            case 'e':

            morseLetter = "."; 
            break; 
            case 'f':

            morseLetter = "..-.";
            break;
            case 'g':

            morseLetter = "--.";
            break;

            case 'h':
            morseLetter = "....";
            break; 

            case 'i':
            morseLetter = "..";
            break; 

            case 'j':
            morseLetter = ".---";
            break; 

            case 'k':
            morseLetter = "-.-"; 
            break;

            case 'l':
            morseLetter = ".-..";
            break;

            case 'm':
            morseLetter = "--";
            break;

            case 'n':
            morseLetter = "-.";
            break; 

            case 'o':
            morseLetter = "---"; 
            break; 

            case 'p':
            morseLetter = ".--.";
            break; 

            case 'q':
            morseLetter = "--.-"; 
            break; 

            case 'r':
            morseLetter = ".-.";
            break; 
            
            case 's':
            morseLetter = "..."; 
            break; 

            case 't':
            morseLetter = "-";
            break; 

            case 'u':
            morseLetter = "..-"; 
            break; 

            case 'v':
            morseLetter = "...-";
            break; 

            case 'w':
            morseLetter = ".--";
            break; 

            case 'x':
            morseLetter = "-..-";
            break;
            
            case 'y':
            morseLetter = "-.--";
            break;

            case 'z':
            morseLetter = "--..";
            break; 

            //numbers 
            case '1':
            morseLetter = ".----";
            break; 
            
            case '2':
            morseLetter = "..---";
            break; 

            case '3':
            morseLetter = "...--";
            break; 

            case '4':
            morseLetter = "....-";
            break;
            
            case '5':
            morseLetter = ".....";
            break; 

            case '6':
            morseLetter = "-....";
            break;

            case '7':
            morseLetter = "--...";
            break; 

            case '8':
            morseLetter = "---..";
            break; 

            case '9':
            morseLetter = "----.";
            break;

            //spaces
            case ' ':
            morseLetter = " ";
            break;

        }
        return morseLetter;
    }
    
}
