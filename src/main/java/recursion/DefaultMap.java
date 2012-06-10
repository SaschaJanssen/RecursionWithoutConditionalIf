package recursion;

import java.util.HashMap;
import java.util.Map;

public class DefaultMap<K, V>
	extends HashMap<K, V> {

	/**
	 *
	 */
	private static final long serialVersionUID = -5946404103873350801L;
	private V defaultValue;

	public DefaultMap(V defaultValue) {
		super();
		this.defaultValue = defaultValue;
	}

	@Override
	public V get(Object key) {
		Map<V, V> tempMap = new HashMap<V, V>();
		V value = super.get(key);
		tempMap.put(value, value);
		tempMap.put(null, this.defaultValue);
		return tempMap.get(value);
	}

	public void setDefaultValue(V defaultValue) {
		this.defaultValue = defaultValue;
	}

}
