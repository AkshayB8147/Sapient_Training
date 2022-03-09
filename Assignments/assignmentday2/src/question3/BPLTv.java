package question3;

public class BPLTv implements TvRemote {

	@Override
	public void home() {
		System.out.println("BPLTv: Home Button...");
	}

	@Override
	public void volume() {
		System.out.println("BPLTv: Volume Changed...");
	}

	@Override
	public void changeChannels() {
		System.out.println("BPLTv: Channels changed");
	}

	@Override
	public void keyInputs() {
		System.out.println("BPLTv: Keys pressed");
	}

}
