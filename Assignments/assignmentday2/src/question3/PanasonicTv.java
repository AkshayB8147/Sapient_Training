package question3;

public class PanasonicTv implements TvRemote {
	@Override
	public void home() {
		System.out.println("PanasonicTv: Home Button...");
	}

	@Override
	public void volume() {
		System.out.println("PanasonicTv: Volume Changed...");
	}

	@Override
	public void changeChannels() {
		System.out.println("PanasonicTv: Channels changed");
	}

	@Override
	public void keyInputs() {
		System.out.println("PanasonicTv: Keys pressed");
	}
}