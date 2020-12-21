package C4;

public class DrangDropQuest extends AbstractQuest{
    @Override
    public boolean check(Answer ans) {
        System.out.println("Drag'n'Drop quest");
        return true;
    }
}
