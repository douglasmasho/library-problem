public class StringAlgo {
    public static long HowManyCharsInString( String string,char character){
        return string.chars().filter(el->el == character).count();
    }
}
