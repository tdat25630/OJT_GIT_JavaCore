import java.util.List;

@FunctionalInterface
public interface Filter {
    public void filter(List<Integer> list);
}
