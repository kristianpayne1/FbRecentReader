import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

/**
 * Connects the user's profile and extracts the data needed
 *
 * @author Kristian.j.Payne
 * @version 1.2
 */
public class Parser
{
    private Document doc;
    private String title;

    public Parser(String source)
    {
        doc = Jsoup.parse(source);
    }
    
    public Document getDocument()
    {
        return doc;
    }

}
