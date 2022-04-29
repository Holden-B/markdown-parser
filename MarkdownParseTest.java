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
        List<String> expected = List.of("https://something.com", "https://some-thing.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinks2() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file2old.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://github.com", "https://youtube.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinks3() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file3old.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://google.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew2() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file2.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of("https://something.com");

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew3() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file3.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew4() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file4.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew5() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file5.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew6() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file6.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew7() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file7.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }

    @Test
    public void getlinksnew8() throws IOException {
        Path fileName = Path.of("C:/Users/17142/Documents/GitHub/markdown-parser/test-file8.md");
        String content = Files.readString(fileName);
        List<String> links = MarkdownParse.getLinks(content);
        List<String> expected = List.of();

        assertEquals(expected, links);
    }
}