package recursion;
import java.util.Map;


public class RecursionExit implements Recursion{

	@Override
	public int callFun(Integer i, Map<Integer, Recursion> recursionMap) {
		return i.intValue();
	}

}
