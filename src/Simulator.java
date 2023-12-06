import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Simulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo na pasta files (Exemplo: 100p.txt):");
        String fileName = scanner.nextLine();

        MemoryReader memoryReader = new MemoryReader("files/" + fileName);
        List<String> memoryContents = null;
        try {
            memoryContents = memoryReader.parseFile();
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado.");
            System.exit(1);
        }

        MemoryRAM memoryRam = new MemoryRAM(memoryContents);
        MemorySAM memorySam = new MemorySAM(memoryContents);

        System.out.println("Digite o conteúdo a ser procurado:");
        String searchContent = scanner.nextLine();

        searchMemory(memoryRam, searchContent);
        searchMemory(memorySam, searchContent);
    }

    private static void searchMemory(Memory memory, String searchContent) {
        Timer timer = new Timer();
        timer.start();

        Integer memoryIndex = memory.searchMemory(searchContent);

        timer.stop();

        System.out.printf("%s. Índice: %d. Tempo: %s.%n", memory.getMemoryName(), memoryIndex, timer.getFormattedTime());
    }
}
