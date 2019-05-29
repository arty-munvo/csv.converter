package converters;


import java.nio.file.Path;

public interface Converter {
    void convert(Path path) throws Exception;

    String toString();
}
