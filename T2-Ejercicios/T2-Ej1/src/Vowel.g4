/** Grammars always start with a grammar header. This grammar is called
* ArrayInit and must match the filename: ArrayInit.g4
*/
grammar Vowel;
/** A rule called r that matches lowcase vowel and others */
r:((LOWVOWEL)+|(OTHER)+)+;
LOWVOWEL : [aeiou]{System.out.print(getText().toUpperCase());};
OTHER : . {System.out.print(getText());};