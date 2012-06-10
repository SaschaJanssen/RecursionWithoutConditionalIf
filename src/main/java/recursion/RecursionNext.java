package recursion;
import java.util.Map;


public class RecursionNext implements Recursion{

	@Override
	public int callFun(Integer i, Map<Integer, Recursion> recursionMap) {
		// recursion logic
		i++;
		System.out.println(i);

		// next recursion call or exit
		Recursion clazz = recursionMap.get(i);
		return clazz.callFun(i, recursionMap);
	}

}
