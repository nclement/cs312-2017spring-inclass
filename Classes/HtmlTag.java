
/**
 * Write a description of class HtmlTag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HtmlTag
{
    private String tagName;
    private boolean isOpen;
    
    public HtmlTag(String n, boolean o) {
        tagName = n;
        isOpen = o;
    }
    
    /**
     * Returns:
     *   < 0 if self < other
     *   > 0 if self > other (after)
     *   0 if self == other
     *   
     *   // [<b>, </b>, <body>, </body>, <br/>, <i>, </i>]
     */
    public int compareTo(HtmlTag other) {
        // First, check the name
        if (!tagName.equals(other.tagName)) {
            return tagName.compareTo(other.tagName);
        } else {
            if (isOpen && !other.isOpen) {
                return -1;
            } else if (!isOpen && other.isOpen) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
