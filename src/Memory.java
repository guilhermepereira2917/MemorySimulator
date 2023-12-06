import java.util.List;

public abstract class Memory {
    protected List<String> contents;

    public Memory(List<String> contents) {
        this.contents = contents;
    }

    public abstract String getMemoryName();
    public abstract Integer searchMemory(String content);
}
