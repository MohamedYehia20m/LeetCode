import re

class Solution:
    def reverseWords(self, s: str) -> str:
    # Tokenize the string by space and include spaces as delimiters
        tokens = re.findall(r'\S+|\s+', s)
    # Remove empty strings from the result
        words_with_delimiters = [word[::-1] for word in tokens if word]
    # Print the list of words with spaces as delimiters
        return "".join(words_with_delimiters)

        