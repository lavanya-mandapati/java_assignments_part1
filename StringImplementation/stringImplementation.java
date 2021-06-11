package StringImplementation;

public class stringImplementation {
    public boolean stringAlphabetCount(String alphabet,String str) {
        if(alphabet.length() < str.length()) {
            int count = 0;
            for (int i = 0; i < alphabet.length(); i++) {
                char ch1 = alphabet.charAt(i);
                char ch2 = Character.toUpperCase(ch1);
                if (str.indexOf(ch1) == -1) {
                    if (str.indexOf(ch2) == -1) {
                        return false;
                    } else {
                        count = count + 1;
                    }
                } else {
                    count = count + 1;
                }
            }
            if (count == 26) {
                return true;
            }

        }
        else
        {
            int count=0;
            for(int i=0;i<str.length();i++)
            {
                char ch1 = str.charAt(i);
                char ch2 = Character.toUpperCase(ch1);
                if (alphabet.indexOf(ch1) == -1) {
                    if (alphabet.indexOf(ch2) == -1)
                    {
                        return false;
                    } else
                    {
                        count = count + 1;
                    }
                } else
                {
                    count = count + 1;
                }
            }
            if (count == 26) {
                return true;
            }
        }
        return true;
    }
}
