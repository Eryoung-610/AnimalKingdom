
public class BelugaWhale extends Whale {

	public BelugaWhale(int id, String name,BirthType birthtype) {
		super(id, name, birthtype);
	}

	public String getDescription() {
		String s = super.getDescription();
		s += "\t Beluga Whale";
		return s;
	}

}
