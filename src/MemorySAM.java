import java.util.List;

public class MemorySAM extends Memory {
    public MemorySAM(List<String> contents) {
        super(contents);
    }

    @Override
    public String getMemoryName() {
        return "Memória SAM";
    }

    @Override
    public Integer searchMemory(String content) {
        for (int i = 0; i < contents.size(); i++) {
            String memoryContent = contents.get(i);

            if (content.equals(memoryContent)) {
                return i;
            }
        }

        return null;
    }
}
