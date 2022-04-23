import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;
import org.junit.*;

public class MarkdownParseTest {
    @Test //tester
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void getlinks1() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinks2() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://github.com", "https://youtube.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinks3() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://google.com", "https://youtube.com");

        assertEquals(expected, links);
    }
}