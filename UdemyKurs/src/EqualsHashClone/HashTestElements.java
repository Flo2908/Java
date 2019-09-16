package EqualsHashClone;

public class HashTestElements {

	private int x;
	private int y;
	private int z;

	public HashTestElements(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof HashTestElements)) {
			return false;
		}
		HashTestElements e = (HashTestElements) o;
		return e.x == this.x && e.y == this.y && e.z == this.z;
	}

	@Override
	public int hashCode() {
		return x * 31 + y * 99 + (z * 28);
	}

}
