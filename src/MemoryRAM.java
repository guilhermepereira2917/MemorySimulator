import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryRAM extends Memory {
    private Map<String, Integer> map;

    public MemoryRAM(List<String> contents) {
        super(contents);
        indexateMemory();
    }

    @Override
    public String getMemoryName() {
        return "Memória RAM";
    }

    private void indexateMemory() {
        map = new HashMap<>();

        for (int i = 0; i < contents.size(); i++) {
            String memoryContent = contents.get(i);

            map.put(memoryContent, i);
        }
    }

    @Override
    public Integer searchMemory(String content) {
        return map.get(content);
    }
}
