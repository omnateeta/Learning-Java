
/* word is considered valid if:

It contains a minimum of 3 characters.
It contains only digits (0-9), and English letters (uppercase and lowercase).
It includes at least one vowel.
It includes at least one consonant.
You are given a string word.

Return true if word is valid, otherwise, return false.

Notes:

'a', 'e', 'i', 'o', 'u', and their uppercases are vowels.
A consonant is an English letter that is not a vowel.
    */class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
        {
            return false;
        }
        boolean isVowel = false,
        isConsonant = false;
        for(char c: word.toCharArray()){
            if(!Character.isDigit(c) && ! Character.isLetter(c)){
                return false;
            }
            if(Character.isLetter(c)){
                if(isVowel(c)){
                    isVowel =true;
                }else{
                    isConsonant = true;
                }
            }
        }
        return isVowel && isConsonant;
    }
    private boolean isVowel(char c){
        return c =='A'||  c =='E' || c =='I' || c =='O' || c =='U' ||
               c =='a'|| c == 'e'|| c =='i' || c =='o' || c =='u';
    }
}
